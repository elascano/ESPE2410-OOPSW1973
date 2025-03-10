
from utils.database import Database

class MongoModel:
    def __init__(self):
        self.db = Database("mongodb+srv://mpasquel:mpasquel@cluster0.be8gs.mongodb.net/", "mongo_push_app")
        self.collection = self.db.get_collection("objects")

    def create_object(self, data):
        return self.collection.insert_one(data).inserted_id

    def list_objects(self):
        return list(self.collection.find({}))


def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)

def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr

def decide_sort(arr):
    if len(arr) <= 20:
        return insertion_sort(arr)
    if len(arr) <= 100:
        return bubble_sort(arr)
    return quick_sort(arr)

# Ejemplo de uso
arr = [64, 34, 25, 12, 22, 11, 90]
sorted_arr = decide_sort(arr.copy())
print("Arreglo ordenado:", sorted_arr)
