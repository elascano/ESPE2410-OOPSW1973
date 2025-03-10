
import tkinter as tk
from tkinter import messagebox

class CreateObjectView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.root.title("Crear Nuevo Objeto")
        self.root.geometry("300x200")

        self.label = tk.Label(root, text="Crear Nuevo Objeto", font=("Arial", 14))
        self.label.pack(pady=20)

        self.name_label = tk.Label(root, text="Nombre:")
        self.name_label.pack()
        self.name_entry = tk.Entry(root)
        self.name_entry.pack()

        self.save_button = tk.Button(root, text="Guardar", command=self.save_object)
        self.save_button.pack(pady=10)

    def save_object(self):
        name = self.name_entry.get()
        if name:
            self.controller.create_object({"name": name})
            self.root.destroy()
        else:
            messagebox.showerror("Error", "El nombre no puede estar vacío")