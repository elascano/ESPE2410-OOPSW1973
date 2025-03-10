import tkinter as tk
from tkinter import messagebox
from MongoDatabase import MongoDatabase
from SortingStrategy import SortingContext, BubbleSort, InsertionSort, QuickSort

class SortApp:
    def __init__(self):
        self.context = None
    
    def set_sort_strategy(self, array_size):
        if 2 <= array_size <= 5:
            self.context = SortingContext(BubbleSort())
        elif 6 <= array_size <= 10:
            self.context = SortingContext(InsertionSort())
        else:
            self.context = SortingContext(QuickSort())
    
    def sort(self, array):
        if self.context is not None:
            return self.context.sort(array)
        else:
            print("No sorting strategy set!")

def on_sort_button_click():
    try:
        array = list(map(int, entry.get().split(',')))
        if len(array) < 2:
            messagebox.showerror("Invalid Input", "Please enter at least two numbers.")
            return
        
        array_size = len(array)
        app.set_sort_strategy(array_size)
        sorted_array = app.sort(array)

        # Get the sorting method used
        algorithm_used = type(app.context._strategy).__name__

        # Update the GUI with all required information
        result_label.config(text=f"Sorted Array: {sorted_array}")
        unsorted_label.config(text=f"Unsorted Array: {array}")
        size_label.config(text=f"Array Size: {array_size}")
        method_label.config(text=f"Sorting Method: {algorithm_used}")
        
        db.add_array(array, sorted_array, algorithm_used)
        
        entry.delete(0, tk.END)

    except ValueError:
        messagebox.showerror("Invalid Input", "Please enter a comma-separated list of numbers.")

app = SortApp()
db = MongoDatabase()

root = tk.Tk()
root.title("Sorting App")

entry_label = tk.Label(root, text="Enter numbers (comma-separated):")
entry_label.pack()

entry = tk.Entry(root)
entry.pack()

sort_button = tk.Button(root, text="Sort", command=on_sort_button_click)
sort_button.pack()

unsorted_label = tk.Label(root, text="Unsorted Array: ")
unsorted_label.pack()

result_label = tk.Label(root, text="Sorted Array: ")
result_label.pack()

size_label = tk.Label(root, text="Array Size: ")
size_label.pack()

method_label = tk.Label(root, text="Sorting Method: ")
method_label.pack()

root.mainloop()
