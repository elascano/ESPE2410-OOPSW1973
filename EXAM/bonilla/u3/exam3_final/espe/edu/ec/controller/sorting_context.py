from espe.edu.ec.model.sorting_strategy import BubbleSort, InsertionSort, QuickSort

class SortingContext:
    def __init__(self):
        self.strategy = None

    def set_sort_strategy(self, array_size):
        if 0 < array_size <= 3:
            self.strategy = BubbleSort()
        elif 3 < array_size <= 7:
            self.strategy = InsertionSort()
        else:
            self.strategy = QuickSort()

    def sort(self, data):
        size = len(data)
        self.set_sort_strategy(size)
        return self.strategy.sort(data)
