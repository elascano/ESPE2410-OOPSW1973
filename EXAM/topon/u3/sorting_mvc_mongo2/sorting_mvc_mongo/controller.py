from strategy import BubbleSort, InsertionSort, QuickSort, SortingStrategy
from model import SortingModel
from tkinter import messagebox

class SortingContext:
    def __init__(self, strategy: SortingStrategy):
        self.strategy = strategy
    
    def set_strategy(self, strategy: SortingStrategy):
        self.strategy = strategy

    def sort(self, data):
        return self.strategy.sort(data)

class SortingController:
    def __init__(self, model, view):
        self.model = model
        self.view = view

    def sort_numbers(self):
        try:
            numbers = list(map(int, self.view.numbers_entry.get().split(",")))
            algorithm = self.view.algorithm_var.get()

           
            strategy_map = {
                "Bubble Sort": BubbleSort(),
                "Insertion Sort": InsertionSort(),
                "Quick Sort": QuickSort()
            }

            strategy = strategy_map.get(algorithm)
            if not strategy:
                messagebox.showerror("Error", "Select a valid algorithm")
                return

            context = SortingContext(strategy)
            sorted_numbers = context.sort(numbers)

            self.model.save_sorting(numbers, sorted_numbers, algorithm)
            self.view.label_result.config(text=f"Order of Numbers : {sorted_numbers}")
            messagebox.showinfo("Success", "Data saved in MongoDB")
        except ValueError:
            messagebox.showerror("Error", "Enter valid numbers separated by comma")
