from controller import SortingController
from model import SortingModel
from tkinter import Tk, Label, Entry, Button, StringVar, OptionMenu

class SortingView:
    def __init__(self, root, controller):
        self.controller = controller  

        root.title("Ordenamiento con Estrategia")

        Label(root, text="Ingrese números separados por comas:").pack()
        self.numbers_entry = Entry(root)
        self.numbers_entry.pack()

        self.algorithm_var = StringVar(root)
        self.algorithm_var.set("Bubble Sort")  # Valor predeterminado
        OptionMenu(root, self.algorithm_var, "Bubble Sort", "Quick Sort", "Insertion Sort").pack()


        Button(root, text="Ordenar", command=self.sort_numbers).pack()

        # Agregamos la etiqueta para mostrar el resultado
        self.label_result = Label(root, text="Resultado:")
        self.label_result.pack()
    
    def sort_numbers(self):
        self.controller.sort_numbers()

if __name__ == "__main__":
    root = Tk()
    model = SortingModel()
    controller = SortingController(model, None)  # Se pasará la vista después
    view = SortingView(root, controller)
    controller.view = view  # Ahora la vista está correctamente asignada en el controlador
    root.mainloop()

