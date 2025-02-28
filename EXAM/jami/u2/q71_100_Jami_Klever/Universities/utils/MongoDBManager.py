from pymongo import MongoClient

class MongoDBManager:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://kleverdavid165:POO2025@cluster0.0hjyg.mongodb.net/")
        self.db = self.client["UniversityDB"]

    def get_collection(self):
        return self.db["StudentsUniversity"]
