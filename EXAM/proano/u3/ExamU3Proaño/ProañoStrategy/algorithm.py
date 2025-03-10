from typing import List
from abc import ABC, abstractmethod
from pymongo import MongoClient

client = MongoClient("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/")
db = client["GUI_Python"]
collection = db["Keyboard"]

class SortingStrategy(ABC):
    @abstractmethod
    def sort(self, data: List[int]) -> List[int]:
        pass

class BubbleSort(SortingStrategy):
    def sort(self, data: List[int]) -> List[int]:
        n = len(data)
        for i in range(n):
            for j in range(0, n - i - 1):
                if data[j] > data[j + 1]:
                    data[j], data[j + 1] = data[j + 1], data[j]
        return data

class InsertionSort(SortingStrategy):
    def sort(self, data: List[int]) -> List[int]:
        for i in range(1, len(data)):
            key = data[i]
            j = i - 1
            while j >= 0 and key < data[j]:
                data[j + 1] = data[j]
                j -= 1
            data[j + 1] = key
        return data

class QuickSort(SortingStrategy):
    def sort(self, data: List[int]) -> List[int]:
        if len(data) <= 1:
            return data
        pivot = data[len(data) // 2]
        left = [x for x in data if x < pivot]
        middle = [x for x in data if x == pivot]
        right = [x for x in data if x > pivot]
        return self.sort(left) + middle + self.sort(right)

class SortContext:
    def __init__(self, strategy: SortingStrategy):
        self.strategy = strategy

    def set_strategy(self, strategy: SortingStrategy):
        self.strategy = strategy

    def execute_strategy(self, data: List[int]) -> List[int]:
        return self.strategy.sort(data)

def select_strategy(size: int) -> SortingStrategy:
    if 2 <= size <= 5:
        return BubbleSort()
    elif 6 <= size <= 10:
        return InsertionSort()
    else:
        return QuickSort()

def save_to_mongo(unsorted: List[int], sorted_data: List[int], size: int, algorithm: str):
    record = {
        "unsorted": unsorted,
        "size": size,
        "sort_algorithm": algorithm,
        "sorted": sorted_data 
    }
    collection.insert_one(record)
    print("Datos guardados en MongoDB.")

def main():
    while True:
        try:
            size = int(input("Ingrese el tamaño del arreglo (mínimo 2): "))
            if size < 2:
                print("El tamaño debe ser al menos 2.")
                continue
            break
        except ValueError:
            print("Ingrese un número válido.")

    array = []
    print(f"Ingrese {size} números:")
    for _ in range(size):
        while True:
            try:
                num = int(input())
                array.append(num)
                break
            except ValueError:
                print("Ingrese un número válido.")
    
    strategy = select_strategy(size)
    context = SortContext(strategy)
    sorted_array = context.execute_strategy(array.copy())
    
    print("Arreglo ordenado:", sorted_array)
    save_to_mongo(array, sorted_array, size, strategy.__class__.__name__)

if __name__ == "__main__":
    main()
