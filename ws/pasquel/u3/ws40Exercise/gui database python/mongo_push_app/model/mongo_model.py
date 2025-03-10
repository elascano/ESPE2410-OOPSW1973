
from utils.database import Database

class MongoModel:
    def __init__(self):
        self.db = Database("mongodb+srv://mpasquel:mpasquel@cluster0.be8gs.mongodb.net/", "mongo_push_app")
        self.collection = self.db.get_collection("objects")

    def create_object(self, data):
        return self.collection.insert_one(data).inserted_id

    def list_objects(self):
        return list(self.collection.find({}))