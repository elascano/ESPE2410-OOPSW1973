import tkinter as tk
from tkinter import messagebox
from controller.strategy import decide_sort

class CreateObjectView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.root.title("Create New Array")
        self.root.geometry("300x200")

        self.label = tk.Label(root, text="Insert New Array", font=("Arial", 14))
        self.label.pack(pady=20)

        self.array_label = tk.Label(root, text="Array (comma-separated):")
        self.array_label.pack()
        self.array_entry = tk.Entry(root)
        self.array_entry.pack()

        self.save_button = tk.Button(root, text="Sort and Save", command=self.save_object)
        self.save_button.pack(pady=10)

    def save_object(self):
        try:
            array = list(map(int, self.array_entry.get().split(',')))
            if array:
                data = {'array': array}
                self.controller.create_object(data)
                self.root.destroy()
                messagebox.showinfo("Success", "Array sorted and saved!")
            else:
                raise ValueError("Array cannot be empty")
        except ValueError:
            messagebox.showerror("Error", "Invalid array input. Please enter integers only.")
