from model.sorting_strategy import SortingStrategy 

class BubbleSort(SortingStrategy):
    def sort(self, data):
        print("Using BubbleSort...")
        n = len(data)
        for i in range(n - 1):
            for j in range(n - i - 1):
                if data[j] > data[j + 1]:
                    data[j], data[j + 1] = data[j + 1], data[j]  
        return data
