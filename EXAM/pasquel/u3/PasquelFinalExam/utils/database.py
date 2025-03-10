from pymongo import MongoClient

class Database:
    def __init__(self, connection_string, database_name):
        self.client = MongoClient(connection_string)
        self.db = self.client[database_name]

    def get_collection(self, collection_name):
        return self.db[collection_name]
