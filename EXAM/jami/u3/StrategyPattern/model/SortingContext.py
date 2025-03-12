from model.SortingStrategy import SortingStrategy
from model.BubbleSort import BubbleSort
from model.InsertionSort import InsertionSort
from model.QuickSort import QuickSort

class SortingContext:
    def __init__(self):
        self.strategy = None

    def setStrategy(self, arraySize):
        if 2 <= arraySize <= 5:
            self.strategy = BubbleSort()
        elif 6 <= arraySize <= 10:
            self.strategy = InsertionSort()
        else:
            self.strategy = QuickSort()

    def sort(self, data):
        if not self.strategy:
            raise ValueError("Strategy not set")
        return self.strategy.sort(data)
