from pymongo import MongoClient # type: ignore

class SortingModel:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://mtopon:mtopon@cluster0.nmg4z.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        self.db = self.client["ToponStrategy"]
        self.collection = self.db["MateoSortedArray"]

    def save_sorting(self, unsorted, sorted_arr, algorithm):
        data = {
            "unsorted": unsorted,
            "size": len(unsorted),
            "sort_algorithm": algorithm,
            "sorted": sorted_arr
        }
        self.collection.insert_one(data)
