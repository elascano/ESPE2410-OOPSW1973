from pymongo import MongoClient
from pymongo.collection import Collection
from pymongo.database import Database
from bson import ObjectId
from ec.espe.espe.hw40_uri_python.model import project
from utils.mongodb_connection import MongoDBConnection

class ProjectController:
    COLLECTION_NAME = "Projects"
    collection: Collection = MongoDBConnection.get_database()[COLLECTION_NAME]

    @staticmethod
    def get_project(project_id: str):
        return ProjectController.collection.find_one({"projectId": project_id})

    @staticmethod
    def add_project(project: project) -> bool:
        try:
            ProjectController.collection.insert_one(project.to_document())
            return True
        except Exception as e:
            print(f"Error al agregar el proyecto: {e}")
            return False

    @staticmethod
    def update_project_status(project_id: str, new_status: str) -> bool:
        result = ProjectController.collection.update_one(
            {"projectId": project_id},
            {"$set": {"operationalStatus": new_status}}
        )
        return result.modified_count > 0

    @staticmethod
    def delete_project(project_id: str) -> bool:
        result = ProjectController.collection.delete_one({"projectId": project_id})
        return result.deleted_count > 0
