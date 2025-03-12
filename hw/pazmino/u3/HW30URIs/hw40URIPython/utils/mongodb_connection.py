import os
from pymongo import MongoClient

class MongoDBConnection:
    CONNECTION_STRING = "mongodb+srv://dapilatasig:dapilatasig@cluster0.1qaby.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
    DATABASE_NAME = "OOP_MoleProject"
    COLLECTION_NAME = "Projects"
    _database = None

    @classmethod
    def get_database(cls):
        if cls._database is None:
            mongo_client = MongoClient(cls.CONNECTION_STRING)
            cls._database = mongo_client[cls.DATABASE_NAME]
        return cls._database
