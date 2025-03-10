class SortingStrategy:
    def sort(self, data):
        pass

class QuickSort(SortingStrategy):
    def sort(self, data):
        sorted_data = self.quick_sort(data, 0, len(data) - 1)
        return sorted_data

    def quick_sort(self, data, low, high):
        if low < high:
            part = self.partition(data, low, high)
            self.quick_sort(data, low, part - 1)
            self.quick_sort(data, part + 1, high)
        return data

    def partition(self, data, low, high):
        pivot = data[high]
        i = low - 1
        for j in range(low, high):
            if data[j] <= pivot:
                i += 1
                data[i], data[j] = data[j], data[i]
        data[i + 1], data[high] = data[high], data[i + 1]
        return i + 1
