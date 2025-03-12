import pymongo
from pymongo import MongoClient

class MongoDBManager:
    def __init__(self):
        self.connectionString = "mongodb+srv://kleverdavid165:POO2025@cluster0.0hjyg.mongodb.net/"
        self.databaseName = "JamiStrategy"
        self.client = None
        self.db = None
        self.collection = None
        self.connect()
        
    def connect(self):
        try:
            self.client = MongoClient(self.connectionString)
            self.db = self.client[self.databaseName]
            self.collection = self.db['JamiSortedArray']
            print("Connection to MongoDB established successfully")
        except Exception as e:
            print(f"Error connecting to MongoDB: {e}")
            raise RuntimeError("Could not connect to the database")
    
    def saveSortResult(self, unsorted, size, algorithm, sortedList):
        try:
            data = {
                "unsorted": unsorted,
                "size": size, 
                "sort algorithm": algorithm,
                "InsertionSort": sortedList,
                "sorted": sortedList
            }
            self.collection.insert_one(data)
            print("Data stored in MongoDB")
        except Exception as e:
            print(f"Error saving to MongoDB: {e}")
    
    def closeConnection(self):
        if self.client:
            self.client.close()
