from pymongo import MongoClient
from bson import ObjectId
from utils import MongoDBManager
from controller.sorting_context import SortingContext

class Operation:

    @staticmethod
    def add_sort_method(sort_method):
        try:
            collection = MongoDBManager.get_connection()
            collection.insert_one(sort_method)
        except Exception as e:
            print(f"Failed to insert sort method: {e}")

    @staticmethod
    def perform_sorting(array, strategy):
        context = SortingContext()
        context.set_sort_strategy(strategy)
        context.sort(array)
