import tkinter as tk

class SortedArrayView:
    def __init__(self, root, sorted_array, algorithm_name):
        self.root = root
        self.root.title("Sorted Array")
        self.root.geometry("400x250")

        self.label = tk.Label(root, text=f"Sorted array by {algorithm_name}:", font=("Arial", 14))
        self.label.pack(pady=20)

        self.sorted_array_label = tk.Label(root, text=str(sorted_array), font=("Arial", 12))
        self.sorted_array_label.pack(pady=10)

        self.close_button = tk.Button(root, text="Close", command=self.root.destroy)
        self.close_button.pack(pady=10)
