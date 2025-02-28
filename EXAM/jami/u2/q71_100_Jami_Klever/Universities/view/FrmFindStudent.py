import tkinter as tk
from tkinter import messagebox
from tkinter import ttk
from controller.StudentController import StudentController

class SearchStudentView:
    def __init__(self, root, return_to_menu_callback):
        self.controller = StudentController()
        self.root = root
        self.root.title("Search Student")
        self.root.geometry("800x600")  # Set a proper window size

        self.id_label = tk.Label(root, text="ID")
        self.id_label.pack(pady=5)
        self.id_entry = tk.Entry(root)
        self.id_entry.pack(pady=5)

        self.search_button = tk.Button(root, text="Search", command=self.search_student)
        self.search_button.pack(pady=20)

        self.tree = ttk.Treeview(root, columns=("ID", "Name", "Last Name"), show="headings")
        self.tree.heading("ID", text="ID")
        self.tree.heading("Name", text="Name")
        self.tree.heading("Last Name", text="Last Name")
        self.tree.pack(pady=20)

        self.return_button = tk.Button(root, text="Return to Menu", command=return_to_menu_callback)
        self.return_button.pack(pady=20)

    def search_student(self):
        student_id = self.id_entry.get()
        student = self.controller.findStudentById(student_id)
        for row in self.tree.get_children():
            self.tree.delete(row)
        if student:
            self.tree.insert("", "end", values=(student.get_id(), student.get_name(), student.get_lastName()))
        else:
            messagebox.showerror("Error", "Student not found.")
