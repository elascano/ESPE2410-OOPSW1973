
from model.bubble_sort import BubbleSort
from model.insertion_sort import InsertionSort
from model.quick_sort import QuickSort

class SortingContext:
    def __init__(self):
        self.sort_strategy = None

    def sort(self, data):
        size = len(data)
        self.set_sort_strategy(size)
        return self.sort_strategy.sort(data)

    def set_sort_strategy(self, n):
        if n > 1 and n < 6:
            self.sort_strategy = BubbleSort()
        elif n >= 6 and n < 11:
            self.sort_strategy = InsertionSort()
        elif n >= 11:
            self.sort_strategy = QuickSort()

