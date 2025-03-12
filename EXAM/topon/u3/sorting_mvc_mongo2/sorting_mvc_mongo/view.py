from controller import SortingController
from model import SortingModel
from tkinter import Tk, Label, Entry, Button, StringVar, OptionMenu

class SortingView:
    def __init__(self, root, controller):
        self.controller = controller  

        root.title("Ordering with Strategy")

        Label(root, text="Enter numbers separated by commas:").pack()
        self.numbers_entry = Entry(root)
        self.numbers_entry.pack()

        self.algorithm_var = StringVar(root)
        self.algorithm_var.set("Bubble Sort")  
        OptionMenu(root, self.algorithm_var, "Bubble Sort", "Quick Sort", "Insertion Sort").pack()


        Button(root, text="Order", command=self.sort_numbers).pack()

        self.label_result = Label(root, text="Result:")
        self.label_result.pack()
    
    def sort_numbers(self):
        self.controller.sort_numbers()

if __name__ == "__main__":
    root = Tk()
    model = SortingModel()
    controller = SortingController(model, None) 
    view = SortingView(root, controller)
    controller.view = view 
    root.mainloop()

