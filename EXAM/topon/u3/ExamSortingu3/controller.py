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
            # Convertir la entrada de números en una lista de enteros
            numbers = list(map(int, self.view.numbers_entry.get().split(",")))
            algorithm = self.view.algorithm_var.get()

            # Mapeo de algoritmos con los nombres de las opciones del OptionMenu
            strategy_map = {
                "Bubble Sort": BubbleSort(),
                "Insertion Sort": InsertionSort(),
                "Quick Sort": QuickSort()
            }

            # Verificar si el algoritmo seleccionado existe en el mapa
            strategy = strategy_map.get(algorithm)
            if not strategy:
                messagebox.showerror("Error", "Seleccione un algoritmo válido")
                return

            context = SortingContext(strategy)
            sorted_numbers = context.sort(numbers)

            # Guardar en la base de datos y mostrar el resultado
            self.model.save_sorting(numbers, sorted_numbers, algorithm)
            self.view.label_result.config(text=f"Ordenado: {sorted_numbers}")
            messagebox.showinfo("Éxito", "Datos guardados en MongoDB")
        except ValueError:
            messagebox.showerror("Error", "Ingrese números válidos separados por coma")
