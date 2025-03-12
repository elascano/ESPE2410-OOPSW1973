from model.sorting_strategy import SortingStrategy

class QuickSort(SortingStrategy):
    def sort(self, data):
        print("Using QuickSort...")
        self.quick_sort(data, 0, len(data) - 1)
        return data

    def quick_sort(self, arr, low, high):
        if low < high:
            pivot_index = self.partition(arr, low, high)
            self.quick_sort(arr, low, pivot_index - 1)
            self.quick_sort(arr, pivot_index + 1, high)

    def partition(self, arr, low, high):
        pivot = arr[high]
        i = low - 1
        for j in range(low, high):
            if arr[j] <= pivot:
                i += 1
                arr[i], arr[j] = arr[j], arr[i]  # Swap
        arr[i + 1], arr[high] = arr[high], arr[i + 1]  # Swap
        return i + 1
