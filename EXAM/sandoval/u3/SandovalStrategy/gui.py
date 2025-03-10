import tkinter as tk
from tkinter import messagebox
from sorting_strategies import BubbleSort, InsertionSort, QuickSort
from sorting_context import SortingContext
from database import Database

class SortingApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Sorting Application")
        
        self.label = tk.Label(root, text="Enter numbers separated by commas: ")
        self.label.pack()
        
        self.entry = tk.Entry(root, width=50)
        self.entry.pack()
        
        self.sort_button = tk.Button(root, text="Sort", command=self.sort_numbers)
        self.sort_button.pack()
        
        self.result_label = tk.Label(root, text="")
        self.result_label.pack()
        
        self.database = Database()
    
    def sort_numbers(self):
        input_data = self.entry.get()
        try:
            numbers = list(map(int, input_data.split(',')))
        except ValueError:
            messagebox.showerror("Error", " >:C")
            return
        
        size = len(numbers)
        if 2 <= size <= 5:
            strategy = BubbleSort()
            algorithm_name = "Bubble Sort"
        elif 6 <= size <= 10:
            strategy = InsertionSort()
            algorithm_name = "Insertion Sort"
        elif size == 1:
            messagebox.showerror("Error", " >:C")
            return   
        else:
            strategy = QuickSort()
            algorithm_name = "Quick Sort"
              
        
        sorting_context = SortingContext(strategy)
        sorted_numbers = sorting_context.sort(numbers)
        
        result_text = f"Sorted List: {sorted_numbers}\nAlgorithm Used: {algorithm_name}"
        self.result_label.config(text=result_text)

        record = {
            "unsorted": numbers,
            "size": size,
            "algorithm": algorithm_name,
            "sorted": sorted_numbers
        }
        self.database.save_sorting_record(record)
        
        messagebox.showinfo("Sorting Completed", result_text)