import tkinter as tk
from view.FrmFindStudent import SearchStudentView
from view.FrmAddStudent import AddStudentView
from view.Application import Application  # Import the Application class

def main():
    root = tk.Tk()
    root.geometry("600x400")
    app = Application(root)
    root.mainloop()

if __name__ == "__main__":
    main()
