import tkinter as tk
from controller.main_controller import MainController
#This is the file to run the program
if __name__ == "__main__":
    root = tk.Tk()
    app = MainController(root)
    root.mainloop()
