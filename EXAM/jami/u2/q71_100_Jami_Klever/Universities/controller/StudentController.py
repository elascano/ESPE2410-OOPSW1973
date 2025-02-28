from pymongo import MongoClient
from model.Student import Student
from utils.MongoDBManager import MongoDBManager
from typing import Optional

class StudentController:
    def __init__(self):
        self.db_manager = MongoDBManager()

    def addStudent(self, student: Student) -> str:
        collection = self.db_manager.get_collection()
        if collection.find_one({"_id": student.get_id()}):
            return "Error: Student with this ID already exists."
        collection.insert_one({
            "_id": student.get_id(),
            "name": student.get_name(),
            "lastName": student.get_lastName()
        })
        return "Student added successfully."

    def findStudentById(self, studentId: str) -> Optional[Student]:
        collection = self.db_manager.get_collection()
        student_data = collection.find_one({"_id": studentId})
        if student_data:
            return Student(student_data["_id"], student_data["name"], student_data["lastName"])
        return None
