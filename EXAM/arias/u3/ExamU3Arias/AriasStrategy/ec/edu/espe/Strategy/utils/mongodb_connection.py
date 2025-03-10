from pymongo import MongoClient

class MongoDBConnection:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://ajarias:ajarias@cluster0.8efem.mongodb.net/?retryWrites=true&w=majority")
        self.db = self.client["AriasStrategy"]
        self.collection = self.db["AriasSortedArray"]

    def insert_record(self, record):
        self.collection.insert_one(record)