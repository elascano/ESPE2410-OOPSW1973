import sys
from PyQt6.QtWidgets import (
    QApplication, QMainWindow, QWidget, QVBoxLayout, QHBoxLayout, 
    QLabel, QLineEdit, QPushButton, QTableWidget, QTableWidgetItem, 
    QMessageBox
)
from pymongo import MongoClient
from bson.objectid import ObjectId

class Array:
    def __init__(self,size,algorithm,):
        self.size = size
        self.algorithm = algorithm
        self.unsorted = []
        self.sorted = []

class Sorting_strategy:

    def __init__ (self):
        self

    def sort(self):
        self

class Bubble_sort(Sorting_strategy):

    def __init__ (self):
        self
        
    
    def Sort(mylist):
 
        for i in range(len(mylist)):
            for j in range(len(mylist)-1):
                if mylist[j+1] < mylist[j]:
                    mylist[j],mylist[j+1] = mylist[j+1],mylist[j]
        return mylist


class Insertion_sort(Sorting_strategy):

    def __init__ (self):
        self
        
    def Sort(mylist):
        
        for i in range(1,len(mylist)):
            if mylist[i-1] > mylist[i]:
                for j in range(0,i):
                    if mylist[j] > mylist[i]:
                        mylist[i],mylist[j] =mylist[j],mylist[i]
            return mylist
        
class Quick_sort(Sorting_strategy):

    def __init__ (self):
        self.self = self
        
    
    def Sort(self, mylist):
        less = []
        equal = []
        greater = []
        if len(mylist) > 1:
            pivot = mylist[0]
            for x in mylist:
                if x < pivot:
                    less.append(x)
                if x == pivot:
                    equal.append(x)
                if x > pivot:
                    greater.append(x)
            return self.Sort(less) + equal + self.Sort(greater) 
        else:
            return mylist

class Sorting_context:

    def __init__ (self):
        self

    def set_sort_strategy(self, mylist, size, sort):
        if size < 6:
            sort = Bubble_sort.sort(mylist)
        elif size > 5 & size < 11:
            sort = Insertion_sort.sort(mylist)
        elif size > 10:
            sort = Quick_sort.sort(mylist)
        return sort
    
class MongoDatabase:
    def __init__(self):
        # Replace with your actual MongoDB connection string
        connection_string = "mongodb+srv://andespinosa18:andespinosa18@cluster0.grell.mongodb.net/"
        try:
            self.client = MongoClient(connection_string)
            self.db = self.client['EspinosaStrategy']
            self.collection = self.db['EspinosaSortedArray']
            print("Connected to MongoDB successfully!")
        except Exception as e:
            print(f"MongoDB Connection Error: {e}")
            raise
        

    def add_array(self, Array):
        try:
            # Remove existing _id if present to allow insertion
            Array.pop('_id', None)
            result = self.collection.insert_one(Array)
            return result.inserted_id
        except Exception as e:
            print(f"Error adding array: {e}")
            return None

    def get_all_arrays(self):
        try:
            # Convert MongoDB documents to list, converting ObjectId to string
            return [
                {**array, '_id': str(array['_id'])} 
                for array in self.collection.find()
            ]
        except Exception as e:
            print(f"Error fetching arrays: {e}")
            return []

    def update_array(self, array, updated_data):
        try:
            # Remove _id from update to prevent modification attempt
            updated_data.pop('_id', None)
            self.collection.update_one(
                {'_id': ObjectId(array)}, 
                {'$set': updated_data}
            )
            return True
        except Exception as e:
            print(f"Error updating array: {e}")
            return False

    def delete_array(self, array):
        try:
            self.collection.delete_one({'_id': ObjectId(array)})
            return True
        except Exception as e:
            print(f"Error deleting array: {e}")
            return False

class Sort_app(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('array Management System')
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
        self.id_input = self.create_input_field(input_layout, 'soarted')
        self.name_input = self.create_input_field(input_layout, 'size')
        self.gpa_input = self.create_input_field(input_layout, 'unsoearted:')
        self.age_input = self.create_input_field(input_layout, 'algorithm:')

        # Buttons Layout
        button_layout = QHBoxLayout()
        main_layout.addLayout(button_layout)

        # Action Buttons
        buttons = [
            ('Add', self.add_array),
            ('Update', self.update_array),
            ('Delete', self.delete_array),
            ('Clear', self.clear_fields)
        ]

        for text, method in buttons:
            btn = QPushButton(text)
            btn.clicked.connect(method)
            button_layout.addWidget(btn)

        # Table
        self.table = QTableWidget()
        self.table.setColumnCount(5)  # Added column for MongoDB _id
        self.table.setHorizontalHeaderLabels(['soarted', 'size', 'sort algorithm', 'sorted', 'MongoDB ID'])
        self.table.itemClicked.connect(self.populate_fields)
        main_layout.addWidget(self.table)

        # Database
        self.db = MongoDatabase()
        self.load_arrays()

    def create_input_field(self, layout, label_text):
        layout.addWidget(QLabel(label_text))
        input_field = QLineEdit()
        layout.addWidget(input_field)
        return input_field

    def validate_input(self):
        try:
            array = {
                'id': self.id_input.text(),
                'name': self.name_input.text(),
                'gpa': float(self.gpa_input.text()),
                'age': int(self.age_input.text())
            }
            
            # Basic validation
            if not array['id'] or not array['name']:
                raise ValueError("ID and Name are required")
            if not (0 <= array['gpa'] <= 20):
                raise ValueError("GPA must be between 0 and 20")
            if not (0 < array['age'] < 120):
                raise ValueError("Age must be between 1 and 120")
            
            return array
        except ValueError as e:
            QMessageBox.warning(self, "Validation Error", str(e))
            return None

    def add_array(self):
        array = self.validate_input()
        if array:
            inserted_id = self.db.add_array(array)
            if inserted_id:
                self.load_arrays()
                self.clear_fields()
            else:
                QMessageBox.warning(self, "Error", "Failed to add array")

    def update_array(self):
        array = self.validate_input()
        if array:
            # Get the MongoDB _id from the selected row
            selected_rows = self.table.selectedIndexes()
            if selected_rows:
                row = selected_rows[0].row()
                mongodb_id = self.table.item(row, 4).text()
                
                if self.db.update_array(mongodb_id, array):
                    self.load_arrays()
                    self.clear_fields()
                else:
                    QMessageBox.warning(self, "Error", "Failed to update array")
            else:
                QMessageBox.warning(self, "Error", "Please select a array to update")

    def delete_array(self):
        selected_rows = self.table.selectedIndexes()
        if selected_rows:
            row = selected_rows[0].row()
            mongodb_id = self.table.item(row, 4).text()
            
            if self.db.delete_array(mongodb_id):
                self.load_arrays()
                self.clear_fields()
            else:
                QMessageBox.warning(self, "Error", "Failed to delete array")
        else:
            QMessageBox.warning(self, "Error", "Please select a array to delete")

    def load_arrays(self):
        arrays = self.db.get_all_arrays()
        self.table.setRowCount(len(arrays))
        
        for row, arrays in enumerate(arrays):
            self.table.setItem(row, 0, QTableWidgetItem(str(arrays.get('id', ''))))
            self.table.setItem(row, 1, QTableWidgetItem(str(arrays.get('name', ''))))
            self.table.setItem(row, 2, QTableWidgetItem(str(arrays.get('gpa', ''))))
            self.table.setItem(row, 3, QTableWidgetItem(str(arrays.get('age', ''))))
            self.table.setItem(row, 4, QTableWidgetItem(str(arrays.get('_id', ''))))

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




    