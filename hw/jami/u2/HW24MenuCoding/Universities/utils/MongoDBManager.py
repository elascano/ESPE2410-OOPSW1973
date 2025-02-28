from pymongo import MongoClient

class MongoDBManager:
    def __init__(self):
        # Conectar al cliente de MongoDB usando la URL proporcionada
        self.client = MongoClient("mongodb+srv://kleverdavid165:POO2025@cluster0.0hjyg.mongodb.net/")
        # Seleccionar la base de datos "UniversityDB"
        self.db = self.client["UniversityDB"]

    def get_collection(self):
        # Obtener la colección "StudentsUniversity" de la base de datos
        return self.db["StudentsUniversity"]
