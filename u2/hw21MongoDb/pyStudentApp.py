import sys
import pymongo
from pymongo import MongoClient


def connect_to_mongodb():
    """Connect to MongoDB Atlas and return the students collection"""
    try:
        uri = "mongodb+srv://ajarias:ajarias@cluster0.8efem.mongodb.net/?retryWrites=true&w=majority"
        client = MongoClient(uri)
        db = client['studentsDB']
        collection = db['students']
        client.admin.command('ping')
        print("Successfully connected to MongoDB Atlas!")
        return collection, client
    except Exception as e:
        print(f"Connection error: {e}")
        sys.exit(1)

def add_student(collection):
    """Add a new student to the database"""
    try:
        id = input("Enter Student ID: ")
        name = input("Enter Student Name: ")
        while True:
            try:
                gpa = float(input("Enter Student GPA (0-20): "))
                if 0.0 <= gpa <= 20.0:
                    break
                print("GPA must be between 0.0 and 20.0")
            except ValueError:
                print("Please enter a valid number for GPA")
        while True:
            try:
                age = int(input("Enter Student Age: "))
                if age > 0:
                    break
                print("Age must be positive")
            except ValueError:
                print("Please enter a valid number for age")
        student = {
            "id": id,
            "name": name,
            "GPA": gpa,
            "ageInYears": age
        }
        collection.insert_one(student)
        print("\nStudent added successfully!")
        print("Student details:")
        print(f"ID: {id}")
        print(f"Name: {name}")
        print(f"GPA: {gpa}")
        print(f"Age: {age}")

    except Exception as e:
        print(f"Error adding student: {e}")

def main():
    print("=== Student Creator Program ===")
    collection, client = connect_to_mongodb()
    
    try:
        while True:
            print("\n1. Add new student")
            print("2. Exit")
            choice = input("\nSelect an option (1-2): ")

            if choice == "1":
                add_student(collection)
            elif choice == "2":
                print("Goodbye!")
                break
            else:
                print("Invalid option. Please try again.")
                
    except KeyboardInterrupt:
        print("\nProgram terminated by user.")
    finally:
        client.close()

if __name__ == "__main__":
    main()