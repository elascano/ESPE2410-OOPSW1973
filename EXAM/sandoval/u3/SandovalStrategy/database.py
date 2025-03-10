from pymongo import MongoClient

class Database:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://aesandoval:aesandoval@cluster0.5z3gp.mongodb.net/")
        self.db = self.client["ExamU3"]
        self.collection = self.db["SandovalSortedArray"]
    
    def save_sorting_record(self, record):
        self.collection.insert_one(record)