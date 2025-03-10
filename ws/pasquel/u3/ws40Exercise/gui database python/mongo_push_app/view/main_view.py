
import tkinter as tk
from tkinter import messagebox

class MainView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.root.title("Mongo Push App")
        self.root.geometry("300x200")

        self.label = tk.Label(root, text="Mongo Push App", font=("Arial", 16))
        self.label.pack(pady=20)

        self.create_button = tk.Button(root, text="Crear Nuevo Objeto", command=self.controller.open_create_view)
        self.create_button.pack(pady=10)

        self.list_button = tk.Button(root, text="Listar Objetos", command=self.controller.open_list_view)
        self.list_button.pack(pady=10)

    def show_error(self, message):
        messagebox.showerror("Error", message)