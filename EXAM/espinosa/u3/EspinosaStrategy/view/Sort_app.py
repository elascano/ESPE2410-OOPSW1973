import sys
from PyQt6.QtWidgets import (
    QApplication, QMainWindow, QWidget, QVBoxLayout, QHBoxLayout, 
    QLabel, QLineEdit, QPushButton, QTableWidget, QTableWidgetItem, 
    QMessageBox
)
from utils.MongoDB_manager import MongoDatabase 

class Sort_app(QMainWindow):
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
    window = Sort_app()
    window.show()
    sys.exit(app.exec())

if __name__ == '__main__':
    main()