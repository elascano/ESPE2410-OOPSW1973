from pymongo import MongoClient
from pymongo.errors import ConnectionError

class MongoDBManager:
    CONNECTION_URI = "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"  
    DATABASE_NAME = "OOP"  

    def __init__(self):
        try:
            self.mongo_client = MongoClient(self.CONNECTION_URI)
            self.database = self.mongo_client[self.DATABASE_NAME]
        except ConnectionError as e:
            print("Error connecting to MongoDB:", e)

    def get_collection(self, collection_name):
        return self.database[collection_name]

    def close_connection(self):
        if self.mongo_client:
            self.mongo_client.close()

# Ejemplo de uso
if __name__ == "__main__":
    mongo_manager = MongoDBManager()
    collection = mongo_manager.get_collection("tu_coleccion") 
 

    mongo_manager.close_connection()