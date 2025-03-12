import tkinter as tk
from tkinter import messagebox
from controller.SortController import SortController

class SortApp:
    def __init__(self, root):
        self.controller = SortController()
        self.root = root
        self.root.title("Sorting Application")
        self.root.geometry("400x200")  # Ajustar el tamaño de la ventana

        self.label = tk.Label(root, text="Enter numbers separated by commas:")
        self.label.pack(pady=10)

        self.entry = tk.Entry(root, width=50)
        self.entry.pack(pady=10)

        self.sortButton = tk.Button(root, text="Sort", command=self.sort)
        self.sortButton.pack(pady=10)

        self.resultLabel = tk.Label(root, text="")
        self.resultLabel.pack(pady=10)

    def sort(self):
        inputData = self.entry.get()
        try:
            sortedData = self.controller.sort(inputData)
            self.resultLabel.config(text=f"Sorted: {sortedData}")
            messagebox.showinfo("Sorted Result", f"Sorted: {sortedData}")
        except ValueError as e:
            messagebox.showerror("Error", str(e))

if __name__ == "__main__":
    root = tk.Tk()
    app = SortApp(root)
    root.mainloop()
