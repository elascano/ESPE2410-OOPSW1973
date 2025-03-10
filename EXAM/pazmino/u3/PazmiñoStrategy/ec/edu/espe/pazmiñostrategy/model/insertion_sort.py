class SortingStrategy:
    def sort(self, data):
        pass

class InsertionSort(SortingStrategy):
    def sort(self, data):
        size = len(data)
        for i in range(1, size):
            key = data[i]
            j = i - 1
            while j >= 0 and data[j] > key:
                data[j + 1] = data[j]
                j -= 1
            data[j + 1] = key
        return data
