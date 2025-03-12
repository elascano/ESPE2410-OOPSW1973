from model.SortingContext import SortingContext
from utils.MongoDBManager import MongoDBManager
import re 

regex = r'^\d+(,\d+)+$'
class SortController:
    def __init__(self):
        self.context = SortingContext()
        self.dbManager = MongoDBManager()

    def sort(self, inputData):
        
        if not re.match(regex, inputData):

            raise ValueError("Negative numbers are not allowed.")
        data = [int(x) for x in inputData.split(",")]
        self.context.setStrategy(len(data))
        sortedData = self.context.sort(data)

        self.dbManager.saveSortResult(inputData, len(data), self.context.strategy.__class__.__name__, ",".join(map(str, sortedData)))
        return sortedData
