from model.student import Student
from bson import ObjectId

class StudentController:
    def __init__(self, mongodb_manager):
        self.mongodb_manager = mongodb_manager
        self.collection = self.mongodb_manager.get_collection('students')
    
    def add_student(self, name, gpa, age):
        student = Student(name=name, gpa=gpa, age=age)
        result = self.collection.insert_one(student.to_dict())
        return str(result.inserted_id)
    
    def get_all_students(self):
        students = []
        for doc in self.collection.find():
            students.append(Student.from_dict(doc))
        return students
    
    def get_student_by_id(self, student_id):
        try:
            doc = self.collection.find_one({"_id": ObjectId(student_id)})
            if doc:
                return Student.from_dict(doc)
            return None
        except Exception:
            return None
    
    def update_student(self, student_id, name, gpa, age):
        try:
            result = self.collection.update_one(
                {"_id": ObjectId(student_id)},
                {"$set": {"name": name, "gpa": gpa, "age": age}}
            )
            return result.modified_count > 0
        except Exception:
            return False
    
    def delete_student(self, student_id):
        try:
            result = self.collection.delete_one({"_id": ObjectId(student_id)})
            return result.deleted_count > 0
        except Exception:
            return False