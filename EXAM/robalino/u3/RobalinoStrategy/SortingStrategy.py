from abc import ABC, abstractmethod
class SortingStrategy(ABC):
    @abstractmethod
    def sort(self, array):
        pass

class QuickSort(SortingStrategy):
    def sort(self, array):
        print("QuickSort: Sorting array:", array)
        if len(array) <= 1:
            return array
        pivot = array[len(array) // 2]
        left = [x for x in array if x < pivot]
        middle = [x for x in array if x == pivot]
        right = [x for x in array if x > pivot]
        return self.sort(left) + middle + self.sort(right)

class InsertionSort(SortingStrategy):
    def sort(self, array):
        print("InsertionSort: Sorting array:", array)
        for i in range(1, len(array)):
            key = array[i]
            j = i - 1
            while j >= 0 and key < array[j]:
                array[j + 1] = array[j]
                j -= 1
            array[j + 1] = key
        return array
    
class BubbleSort(SortingStrategy):
    def sort(self, array):
        print("BubbleSort: Sorting array:", array)
        n = len(array)
        for i in range(n):
            for j in range(0, n-i-1):
                if array[j] > array[j+1]:
                    array[j], array[j+1] = array[j+1], array[j]
        return array

class SortingContext:
    def __init__(self, strategy: SortingStrategy):
        self._strategy = strategy

    def set_sort_strategy(self, strategy: SortingStrategy):
        self._strategy = strategy

    def sort(self, array):
        return self._strategy.sort(array)

