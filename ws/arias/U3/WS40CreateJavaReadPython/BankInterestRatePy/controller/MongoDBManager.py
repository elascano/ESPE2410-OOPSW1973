from pymongo import MongoClient

class MongoDBManager:
    def __init__(self):
        self.uri = "mongodb+srv://ajarias:ajarias@cluster0.8efem.mongodb.net/?retryWrites=true&w=majority"
        self.client = MongoClient(self.uri)
        self.db = self.client.get_database("BankDB")
        self.collection = self.db.get_collection("interestRates")

    def get_all_data(self):
        try:
            data = list(self.collection.find())
            return data
        except Exception as e:
            print(f"Error reading data from MongoDB: {e}")
            return []