import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient
from pymongo import InsertOne
from utils.mongodb_connection import MongoDBManager
from controller.sorting_context import SortingContext  
from model.sorting_strategy import SortingStrategy
from model.operation import Operation
from model.bubble_sort import BubbleSort  

class sort_app(tk.Tk):
    def __init__(self):
        super().__init__()

        self.title("Aplicación de Ordenamiento")
        self.geometry("450x400")

        self.create_widgets()

    def create_widgets(self):
        self.label_input = tk.Label(self, text="Inserte Valores entre ','")
        self.label_input.pack()

        self.txa_no_sorted_numbers = tk.Text(self, height=5, width=40)
        self.txa_no_sorted_numbers.pack()

        self.label_sorted = tk.Label(self, text="Arreglo:")
        self.label_sorted.pack()

        self.txa_sorted = tk.Text(self, height=5, width=40)
        self.txa_sorted.pack()

        self.label_method = tk.Label(self, text="Estrategia")
        self.label_method.pack()

        self.txt_method = tk.Entry(self)
        self.txt_method.pack()

        self.btn_sort = tk.Button(self, text="Sort", command=self.sort)
        self.btn_sort.pack()

        self.btn_clear = tk.Button(self, text="Clear", command=self.clear)
        self.btn_clear.pack()

    def sort(self):
        try:
            input_text = self.txa_no_sorted_numbers.get("1.0", tk.END).strip()
            numbers = list(map(int, input_text.split(',')))

            context = SortingContext()
            bubble_sort = BubbleSort()
            context.set_sort_strategy(bubble_sort)

            sorted_numbers = context.sort(numbers)

            self.txa_sorted.delete("1.0", tk.END)
            self.txa_sorted.insert(tk.END, str(sorted_numbers))

            self.txt_method.delete(0, tk.END)
            self.txt_method.insert(tk.END, bubble_sort.__class__.__name__)

            document = {
                "unsorted": input_text,
                "size": len(numbers),
                "sortAlgorithm": bubble_sort.__class__.__name__,
                "sorted": str(sorted_numbers)
            }
            Operation.add_sort_method(document)

        except ValueError:
            messagebox.showerror("Invalid Input", "ingrese datos separados por comas.")

    def clear(self):
        self.txa_no_sorted_numbers.delete("1.0", tk.END)
        self.txa_sorted.delete("1.0", tk.END)
        self.txt_method.delete(0, tk.END)

if __name__ == "__main__":
    app = sort_app() 
    app.mainloop()