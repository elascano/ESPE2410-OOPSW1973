# utils/mongodb_manager.py
from pymongo import MongoClient
from pymongo.errors import ConnectionFailure, ServerSelectionTimeoutError

class MongoDBManager:
    def __init__(self, username, password, appname):
        self.username = username
        self.password = password
        self.appname = appname
        self.client = None
        self.db = None
        self.connect()
    
    def connect(self):
        try:
            connection_string = f"mongodb+srv://{self.username}:{self.password}@cluster0.grell.mongodb.net/?retryWrites=true&w=majority&appName={self.appname}"
            self.client = MongoClient(connection_string, serverSelectionTimeoutMS=5000)
            self.client.admin.command('ping')
            self.db = self.client.student_db
            return True
        except (ConnectionFailure, ServerSelectionTimeoutError) as e:
            print(f"Failed to connect to MongoDB Atlas: {e}")
            return False
    
    def get_collection(self, collection_name):
        if self.db:
            return self.db[collection_name]
        return None
    
    def close(self):
        if self.client:
            self.client.close()