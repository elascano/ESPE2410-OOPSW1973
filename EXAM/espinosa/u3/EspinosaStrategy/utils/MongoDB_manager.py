from pymongo import MongoClient
from bson.objectid import ObjectId

class MongoDatabase:
    def __init__(self):
        # Replace with your actual MongoDB connection string
        connection_string = "mongodb+srv://andespinosa18:andespinosa18@cluster0.grell.mongodb.net/"
        try:
            self.client = MongoClient(connection_string)
            self.db = self.client['EspinosaStrategy']
            self.collection = self.db['EspinosaSortedArray']
            print("Connected to MongoDB successfully!")
        except Exception as e:
            print(f"MongoDB Connection Error: {e}")
            raise
        

    def add_student(self, student):
        try:
            # Remove existing _id if present to allow insertion
            student.pop('_id', None)
            result = self.collection.insert_one(student)
            return result.inserted_id
        except Exception as e:
            print(f"Error adding student: {e}")
            return None

    def get_all_students(self):
        try:
            # Convert MongoDB documents to list, converting ObjectId to string
            return [
                {**student, '_id': str(student['_id'])} 
                for student in self.collection.find()
            ]
        except Exception as e:
            print(f"Error fetching students: {e}")
            return []

    def update_student(self, student_id, updated_data):
        try:
            # Remove _id from update to prevent modification attempt
            updated_data.pop('_id', None)
            self.collection.update_one(
                {'_id': ObjectId(student_id)}, 
                {'$set': updated_data}
            )
            return True
        except Exception as e:
            print(f"Error updating student: {e}")
            return False

    def delete_student(self, student_id):
        try:
            self.collection.delete_one({'_id': ObjectId(student_id)})
            return True
        except Exception as e:
            print(f"Error deleting student: {e}")
            return False