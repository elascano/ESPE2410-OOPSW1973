import tkinter as tk
from tkinter import messagebox
from controller import BankInterestRateController

class BankInterestRateView(tk.Tk):
    def __init__(self, controller):
        super().__init__()
        
        self.controller = controller
        self.title("Bank Interest Rate - View Only")
        self.geometry("500x400")
        
        self.label = tk.Label(self, text="Bank Interest Rates", font=("Arial", 18))
        self.label.pack(pady=20)

        self.data_listbox = tk.Listbox(self, width=60, height=10)
        self.data_listbox.pack(pady=20)

        self.load_button = tk.Button(self, text="Load Data", command=self.load_data)
        self.load_button.pack()

    def load_data(self):
        data = self.controller.get_data()
        if data:
            self.data_listbox.delete(0, tk.END)  # Clear existing data
            for item in data:
                text = f"Capital: {item['initialCapital']} | Rate: {item['interestRate']}% | Time: {item['time']} years | Interest: {item['calculatedInterest']}"
                self.data_listbox.insert(tk.END, text)
        else:
            messagebox.showerror("Error", "No data available.")