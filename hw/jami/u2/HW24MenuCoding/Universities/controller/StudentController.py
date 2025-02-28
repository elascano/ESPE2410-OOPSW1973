from pymongo import MongoClient
from model.Student import Student
from utils.MongoDBManager import MongoDBManager
from typing import Optional, List

class StudentController:
    def __init__(self):
        self.db_manager = MongoDBManager()

    # Agrega un nuevo estudiante a la base de datos
    def addStudent(self, student: Student) -> str:
        collection = self.db_manager.get_collection()
        # Verifica si el estudiante ya existe en la base de datos
        if collection.find_one({"_id": student.get_id()}):
            return "Error: Student with this ID already exists."
        # Inserta el nuevo estudiante en la base de datos
        collection.insert_one({
            "_id": student.get_id(),
            "name": student.get_name(),
            "lastName": student.get_lastName(),
            "grades": student.get_grades(),
            "status": student.get_status()
        })
        return "Student added successfully."

    # Busca un estudiante por su ID
    def findStudentById(self, studentId: str) -> Optional[Student]:
        collection = self.db_manager.get_collection()
        student_data = collection.find_one({"_id": studentId})
        # Si se encuentra el estudiante, devuelve una instancia de Student
        if student_data:
            return Student(student_data["_id"], student_data["name"], student_data["lastName"], student_data.get("grades", []))
        return None

    # Actualiza la información de un estudiante existente
    def updateStudent(self, student: Student, old_id: str) -> str:
        collection = self.db_manager.get_collection()
        # Si el ID del estudiante ha cambiado, verifica si el nuevo ID ya existe
        if old_id != student.get_id():
            if collection.find_one({"_id": student.get_id()}):
                return "Error: Student with this ID already exists."
            # Elimina el estudiante con el ID antiguo y agrega el estudiante con el nuevo ID
            collection.delete_one({"_id": old_id})
            collection.insert_one({
                "_id": student.get_id(),
                "name": student.get_name(),
                "lastName": student.get_lastName(),
                "grades": student.get_grades(),
                "status": student.get_status()
            })
        else:
            # Actualiza la información del estudiante sin cambiar el ID
            collection.update_one(
                {"_id": old_id},
                {"$set": {"name": student.get_name(), "lastName": student.get_lastName(), "grades": student.get_grades(), "status": student.get_status()}}
            )
        return "Student updated successfully."

    # Elimina un estudiante de la base de datos
    def deleteStudent(self, studentId: str) -> str:
        collection = self.db_manager.get_collection()
        # Verifica si el estudiante existe en la base de datos
        if not collection.find_one({"_id": studentId}):
            return "Error: Student with this ID does not exist."
        # Elimina el estudiante de la base de datos
        collection.delete_one({"_id": studentId})
        return "Student deleted successfully."

    # Obtiene una lista de todos los estudiantes en la base de datos
    def getAllStudents(self) -> List[Student]:
        collection = self.db_manager.get_collection()
        students = []
        # Recorre todos los documentos en la colección y crea instancias de Student
        for student_data in collection.find():
            students.append(Student(student_data["_id"], student_data["name"], student_data["lastName"], student_data.get("grades", [])))
        return students
