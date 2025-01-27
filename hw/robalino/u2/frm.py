import sys
from PyQt6.QtWidgets import (
    QApplication, QMainWindow, QWidget, QVBoxLayout, QHBoxLayout, 
    QLabel, QLineEdit, QPushButton, QTableWidget, QTableWidgetItem, 
    QMessageBox
)
from pymongo import MongoClient
from bson.objectid import ObjectId

class MongoDatabase:
    def __init__(self):
        # Replace with your actual MongoDB connection string
        connection_string = "mongodb+srv://arobalino:arobalino@cluster0.uhcya.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
        try:
            self.client = MongoClient(connection_string)
            self.db = self.client['studentsDB']
            self.collection = self.db['students']
            print("Connected to MongoDB successfully!")
        except Exception as e:
            print(f"MongoDB Connection Error: {e}")
            raise

    def add_student(self, student):
        try:
            # Remove existing _id if present to allow insertion
            student.pop('_id', None)
            result = self.collection.insert_one(student)
            return result.inserted_id
        except Exception as e:
            print(f"Error adding student: {e}")
            return None

    def get_all_students(self):
        try:
            # Convert MongoDB documents to list, converting ObjectId to string
            return [
                {**student, '_id': str(student['_id'])} 
                for student in self.collection.find()
            ]
        except Exception as e:
            print(f"Error fetching students: {e}")
            return []

    def update_student(self, student_id, updated_data):
        try:
            # Remove _id from update to prevent modification attempt
            updated_data.pop('_id', None)
            self.collection.update_one(
                {'_id': ObjectId(student_id)}, 
                {'$set': updated_data}
            )
            return True
        except Exception as e:
            print(f"Error updating student: {e}")
            return False

    def delete_student(self, student_id):
        try:
            self.collection.delete_one({'_id': ObjectId(student_id)})
            return True
        except Exception as e:
            print(f"Error deleting student: {e}")
            return False

class StudentManagementApp(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Student Management System')
        self.setGeometry(100, 100, 800, 600)

        # Central Widget
        central_widget = QWidget()
        self.setCentralWidget(central_widget)
        main_layout = QVBoxLayout()
        central_widget.setLayout(main_layout)

        # Input Layout
        input_layout = QHBoxLayout()
        main_layout.addLayout(input_layout)

        # Input Fields
        self.id_input = self.create_input_field(input_layout, 'Student ID:')
        self.name_input = self.create_input_field(input_layout, 'Name:')
        self.gpa_input = self.create_input_field(input_layout, 'GPA:')
        self.age_input = self.create_input_field(input_layout, 'Age:')

        # Buttons Layout
        button_layout = QHBoxLayout()
        main_layout.addLayout(button_layout)

        # Action Buttons
        buttons = [
            ('Add', self.add_student),
            ('Update', self.update_student),
            ('Delete', self.delete_student),
            ('Clear', self.clear_fields)
        ]

        for text, method in buttons:
            btn = QPushButton(text)
            btn.clicked.connect(method)
            button_layout.addWidget(btn)

        # Table
        self.table = QTableWidget()
        self.table.setColumnCount(5)  # Added column for MongoDB _id
        self.table.setHorizontalHeaderLabels(['ID', 'Name', 'GPA', 'Age', 'MongoDB ID'])
        self.table.itemClicked.connect(self.populate_fields)
        main_layout.addWidget(self.table)

        # Database
        self.db = MongoDatabase()
        self.load_students()

    def create_input_field(self, layout, label_text):
        layout.addWidget(QLabel(label_text))
        input_field = QLineEdit()
        layout.addWidget(input_field)
        return input_field

    def validate_input(self):
        try:
            student = {
                'id': self.id_input.text(),
                'name': self.name_input.text(),
                'gpa': float(self.gpa_input.text()),
                'age': int(self.age_input.text())
            }
            
            # Basic validation
            if not student['id'] or not student['name']:
                raise ValueError("ID and Name are required")
            if not (0 <= student['gpa'] <= 20):
                raise ValueError("GPA must be between 0 and 20")
            if not (0 < student['age'] < 120):
                raise ValueError("Age must be between 1 and 120")
            
            return student
        except ValueError as e:
            QMessageBox.warning(self, "Validation Error", str(e))
            return None

    def add_student(self):
        student = self.validate_input()
        if student:
            inserted_id = self.db.add_student(student)
            if inserted_id:
                self.load_students()
                self.clear_fields()
            else:
                QMessageBox.warning(self, "Error", "Failed to add student")

    def update_student(self):
        student = self.validate_input()
        if student:
            # Get the MongoDB _id from the selected row
            selected_rows = self.table.selectedIndexes()
            if selected_rows:
                row = selected_rows[0].row()
                mongodb_id = self.table.item(row, 4).text()
                
                if self.db.update_student(mongodb_id, student):
                    self.load_students()
                    self.clear_fields()
                else:
                    QMessageBox.warning(self, "Error", "Failed to update student")
            else:
                QMessageBox.warning(self, "Error", "Please select a student to update")

    def delete_student(self):
        selected_rows = self.table.selectedIndexes()
        if selected_rows:
            row = selected_rows[0].row()
            mongodb_id = self.table.item(row, 4).text()
            
            if self.db.delete_student(mongodb_id):
                self.load_students()
                self.clear_fields()
            else:
                QMessageBox.warning(self, "Error", "Failed to delete student")
        else:
            QMessageBox.warning(self, "Error", "Please select a student to delete")

    def load_students(self):
        students = self.db.get_all_students()
        self.table.setRowCount(len(students))
        
        for row, student in enumerate(students):
            self.table.setItem(row, 0, QTableWidgetItem(str(student.get('id', ''))))
            self.table.setItem(row, 1, QTableWidgetItem(str(student.get('name', ''))))
            self.table.setItem(row, 2, QTableWidgetItem(str(student.get('gpa', ''))))
            self.table.setItem(row, 3, QTableWidgetItem(str(student.get('age', ''))))
            self.table.setItem(row, 4, QTableWidgetItem(str(student.get('_id', ''))))

    def populate_fields(self, item):
        row = item.row()
        self.id_input.setText(self.table.item(row, 0).text())
        self.name_input.setText(self.table.item(row, 1).text())
        self.gpa_input.setText(self.table.item(row, 2).text())
        self.age_input.setText(self.table.item(row, 3).text())

    def clear_fields(self):
        for input_field in [self.id_input, self.name_input, self.gpa_input, self.age_input]:
            input_field.clear()

def main():
    app = QApplication(sys.argv)
    window = StudentManagementApp()
    window.show()
    sys.exit(app.exec())

if __name__ == '__main__':
    main()