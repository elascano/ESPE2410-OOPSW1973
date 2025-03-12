import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient
from pymongo import InsertOne
from utils.mongodb_connection import MongoDBManager
from controller.sorting_context import SortingContext  
from model.sorting_repository import Operation  

class SortApp(tk.Tk):
    def __init__(self):
        super().__init__()

        self.title("Aplicación de Ordenamiento")
        self.geometry("450x450") 

        self.create_widgets()

    def create_widgets(self):
        self.label_input = tk.Label(self, text="Inserte Valores entre ','")
        self.label_input.pack()

        self.txa_no_sorted_numbers = tk.Text(self, height=5, width=40)
        self.txa_no_sorted_numbers.pack()

        self.label_sorted = tk.Label(self, text="Arreglo ordenado:")
        self.label_sorted.pack()

        self.txa_sorted = tk.Text(self, height=5, width=40)
        self.txa_sorted.pack()

        self.label_method = tk.Label(self, text="Estrategia utilizada")
        self.label_method.pack()

        self.txt_method = tk.Entry(self)
        self.txt_method.pack()
        
        self.label_length = tk.Label(self, text="Longitud:")
        self.label_length.pack()

        self.txt_length = tk.Entry(self)  
        self.txt_length.pack()

        self.btn_sort = tk.Button(self, text="Ordenar", command=self.sort)
        self.btn_sort.pack()

        self.btn_clear = tk.Button(self, text="Borrar", command=self.clear)
        self.btn_clear.pack()

    def sort(self):
        try:
            input_text = self.txa_no_sorted_numbers.get("1.0", tk.END).strip()
            if not input_text:
                messagebox.showerror("Error", "Ingrese al menos un número.")
                return

            numbers = list(map(int, input_text.split(',')))
            size = len(numbers) 

            context = SortingContext()
            context.set_sort_strategy(size)  

            sorted_numbers = context.sort(numbers)

            self.txa_sorted.delete("1.0", tk.END)
            self.txa_sorted.insert(tk.END, str(sorted_numbers))

            self.txt_method.delete(0, tk.END)
            self.txt_method.insert(tk.END, context.sort_strategy.__class__.__name__)  

            self.txt_length.delete(0, tk.END)
            self.txt_length.insert(tk.END, str(size))

            document = {
                "unsorted": input_text,
                "size": size,
                "sortAlgorithm": context.sort_strategy.__class__.__name__,
                "sorted": str(sorted_numbers)
            }
            
            if hasattr(Operation, 'add_sort_method') and callable(getattr(Operation, 'add_sort_method')):
                Operation.add_sort_method(document)
            else:
                messagebox.showerror("Error", "El método add_sort_method no está definido correctamente en Operation.")

        except ValueError:
            messagebox.showerror("Error de Entrada", "Ingrese datos separados por comas y solo números.")

    def clear(self):
        self.txa_no_sorted_numbers.delete("1.0", tk.END)
        self.txa_sorted.delete("1.0", tk.END)
        self.txt_method.delete(0, tk.END)
        self.txt_length.delete(0, tk.END) 

if __name__ == "__main__":
    app = SortApp()
    app.mainloop()
