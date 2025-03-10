from pymongo import MongoClient
from bson.objectid import ObjectId
class MongoDatabase:
    def __init__(self):
        connection_string = "mongodb+srv://arobalino:arobalino@cluster0.uhcya.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
        try:
            self.client = MongoClient(connection_string)
            self.db = self.client['RobalinoStrategy']
            self.collection = self.db['RobalinoSortedArray']
            print("Connected to MongoDB successfully!")
        except Exception as e:
            print(f"MongoDB Connection Error: {e}")
            raise
    
    def add_array(self, unsorted_array, sorted_array, algorithm_used):
        try:
            
            document = {
                'unsorted_array': unsorted_array,
                'sorted_array': sorted_array,
                'algorithm_used': algorithm_used
            }
            result = self.collection.insert_one(document)
            return result.inserted_id
        except Exception as e:
            print(f"Error adding array to MongoDB: {e}")
            return None
