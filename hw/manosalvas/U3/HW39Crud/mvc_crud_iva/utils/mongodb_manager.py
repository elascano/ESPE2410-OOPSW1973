from pymongo import MongoClient

class MongoDBManager:
    def __init__(self, uri, db_name, collection_name):
        self.client = MongoClient(uri)
        self.db = self.client[db_name]
        self.collection = self.db[collection_name]

    def insert(self, data):
        return self.collection.insert_one(data)
    
    def get_all(self):
        return list(self.collection.find())
    
    def update(self, product_id, new_values):
        return self.collection.update_one({"_id": product_id}, {"$set": new_values})
    
    def delete(self, product_id):
        return self.collection.delete_one({"_id": product_id})
