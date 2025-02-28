# view/student_view.py
import sys
import os

# Add the parent directory to the path
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from controller.student_controller import StudentController
from utils.mongodb_manager import MongoDBManager

def display_menu():
    print("\n==== Student Management System ====")
    print("1. Add Student")
    print("2. View All Students")
    print("3. View Student by ID")
    print("4. Update Student")
    print("5. Delete Student")
    print("6. Exit")
    return input("Enter your choice (1-6): ")

def run_student_view():
    mongodb_manager = MongoDBManager("andespinosa18", "<db_password>", "Cluster0")
    controller = StudentController(mongodb_manager)
    
    while True:
        choice = display_menu()
        
        # Menu logic here - same as before
        # ...

if __name__ == "__main__":
    run_student_view()