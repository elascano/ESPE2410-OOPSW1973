import tkinter as tk

class MainView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.root.title("Sorting App")
        self.root.geometry("300x200")

        self.label = tk.Label(root, text="Sorting App", font=("Arial", 16))
        self.label.pack(pady=20)

        self.create_button = tk.Button(root, text="Create New Array", command=self.controller.open_create_view)
        self.create_button.pack(pady=10)
