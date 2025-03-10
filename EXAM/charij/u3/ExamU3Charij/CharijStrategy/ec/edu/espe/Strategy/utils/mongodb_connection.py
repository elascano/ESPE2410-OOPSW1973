from pymongo import MongoClient

class MongoDBConnection:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://Sebas:<000>@cluster0.xnrij.mongodb.net/")
        self.db = self.client["SebasStrategy"]
        self.collection = self.db["SebasSortedArray"]

    def insert_record(self, record):
        self.collection.insert_one(record)