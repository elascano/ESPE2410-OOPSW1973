import tkinter as tk
from tkinter import messagebox
from espe.edu.ec.controller.sorting_context import SortingContext
from espe.edu.ec.utils.mongodb_connection import get_database

collection = get_database()

class SortingApp(tk.Tk):
    def __init__(self):
        super().__init__()

        self.title("Sorting App")
        self.geometry("500x500")
        self.config(bg="#f4f4f9")

        # Establecer fuente base
        self.font = ("Arial", 12)

        # Crear interfaz
        self.create_widgets()

    def create_widgets(self):
        # Título
        self.title_label = tk.Label(self, text="Sorting App", font=("Arial", 20, "bold"), bg="#76c7c0", fg="white", padx=20, pady=10)
        self.title_label.pack(fill="x", pady=10)

        # Etiqueta de entrada
        self.lbl_input = tk.Label(self, text="Ingresa los números (separados por comas):", font=self.font, bg="#f4f4f9", fg="#333")
        self.lbl_input.pack(pady=5)

        # Campo de entrada
        self.entry_input = tk.Entry(self, width=50, font=self.font, bd=2, relief="solid", justify="center", bg="#ffffff")
        self.entry_input.pack(pady=10)

        # Botón de ordenar
        self.btn_sort = tk.Button(self, text="Ordenar", font=self.font, bg="#76c7c0", fg="white", bd=0, relief="flat", width=20, command=self.sort_numbers)
        self.btn_sort.pack(pady=15)

        # Etiqueta de salida
        self.lbl_output = tk.Label(self, text="Números ordenados:", font=self.font, bg="#f4f4f9", fg="#333")
        self.lbl_output.pack(pady=5)

        # Área de texto de salida
        self.txt_output = tk.Text(self, width=50, height=5, wrap=tk.WORD, font=self.font, bd=2, relief="solid", bg="#f7f7f7")
        self.txt_output.pack(pady=10)
        self.txt_output.config(state=tk.DISABLED)

        # Etiqueta de método de ordenamiento
        self.lbl_sorting_method = tk.Label(self, text="", font=("Arial", 10), bg="#f4f4f9", fg="#333", anchor='w')
        self.lbl_sorting_method.pack(fill="x", pady=5)

    def sort_numbers(self):
        input_data = self.entry_input.get()
        try:
            data = list(map(int, input_data.split(',')))

            # Validar que todos los números sean positivos
            if any(num <= 0 for num in data):
                raise ValueError("Todos los números deben ser positivos.")

            # Procesar el ordenamiento
            context = SortingContext()
            sorted_data = context.sort(data.copy())  # Usar una copia para mantener la entrada original intacta

            # Mostrar resultados
            self.txt_output.config(state=tk.NORMAL)
            self.txt_output.delete(1.0, tk.END)
            self.txt_output.insert(tk.END, str(sorted_data))
            self.txt_output.config(state=tk.DISABLED)

            # Mostrar el método de ordenamiento
            self.lbl_sorting_method.config(text=f"Método de ordenamiento usado: {context.strategy.__class__.__name__}")

            # Guardar en la base de datos
            self.save_to_database(data, sorted_data, context.strategy.__class__.__name__)

        except ValueError as ve:
            messagebox.showerror("Error", str(ve))
        except Exception as e:
            messagebox.showerror("Error", f"Ocurrió un error: {e}")

    def save_to_database(self, input_data, sorted_data, sorting_method):
        try:
            # Imprimir los datos antes de guardarlos
            print(f"Datos a guardar en la base de datos:")
            print(f"Entrada: {input_data}")
            print(f"Ordenado: {sorted_data}")
            print(f"Método de ordenamiento: {sorting_method}")
            
            # Guardar en la base de datos
            document = {
                "BonillaStrategy_data": input_data,
                "BonillaSortedArray_data": sorted_data,
                "BonillaSorted_method": sorting_method
            }
            collection.insert_one(document)
            print("Los datos han sido guardados en la base de datos.")

        except Exception as e:
            messagebox.showerror("Error en la base de datos", f"No se pudo guardar los datos: {e}")
