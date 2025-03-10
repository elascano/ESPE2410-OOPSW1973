# view/list_objects_view.py
import tkinter as tk

class ListObjectsView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.root.title("Listar Objetos")
        self.root.geometry("400x300")

        self.label = tk.Label(root, text="Lista de Objetos", font=("Arial", 14))
        self.label.pack(pady=20)

        self.listbox = tk.Listbox(root)
        self.listbox.pack(fill=tk.BOTH, expand=True)

        self.load_objects()

    def load_objects(self):
        objects = self.controller.list_objects()
        for obj in objects:
            self.listbox.insert(tk.END, obj["name"])