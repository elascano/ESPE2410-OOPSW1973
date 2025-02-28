import tkinter as tk
from view.FrmFindStudent import SearchStudentView
from view.FrmAddStudent import AddStudentView

class Application:
    def __init__(self, root):
        self.root = root
        self.root.geometry("800x600")  # Set a proper window size
        self.create_menu()

    def create_menu(self):
        for widget in self.root.winfo_children():
            widget.destroy()
        menu = tk.Menu(self.root)
        self.root.config(menu=menu)

        student_menu = tk.Menu(menu)
        menu.add_cascade(label="Student", menu=student_menu)
        student_menu.add_command(label="Search Student", command=self.show_search_student)
        student_menu.add_command(label="Add Student", command=self.show_add_student)

    def show_search_student(self):
        for widget in self.root.winfo_children():
            widget.destroy()
        SearchStudentView(self.root, self.create_menu)

    def show_add_student(self):
        for widget in self.root.winfo_children():
            widget.destroy()
        AddStudentView(self.root, self.create_menu)
