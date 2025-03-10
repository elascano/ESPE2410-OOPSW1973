from pymongo import MongoClient
from pymongo.errors import ConnectionFailure

class MongoDBManager:
    URL = "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/"
    DATABASE_NAME = "PazmiñoStrategy"
    COLLECTION_NAME = "PazmiñoSortedArray"
    cluster = None

    @staticmethod
    def get_connection():
        try:
            if MongoDBManager.cluster is None:
                MongoDBManager.cluster = MongoClient(MongoDBManager.URL)
            database = MongoDBManager.cluster[MongoDBManager.DATABASE_NAME]
            return database[MongoDBManager.COLLECTION_NAME]
        except ConnectionFailure as e:
            print(f"Error connecting to MongoDB Atlas: {e}")
            raise e

    @staticmethod
    def close_connection():
        if MongoDBManager.cluster:
            MongoDBManager.cluster.close()
            MongoDBManager.cluster = None

    @staticmethod
    def shutdown_hook():
        import atexit
        atexit.register(MongoDBManager.close_connection)

if __name__ == "__main__":
    MongoDBManager.shutdown_hook()  
    try:
        collection = MongoDBManager.get_connection()
        print("Connected to the collection:", collection)
    finally:
        MongoDBManager.close_connection()  
