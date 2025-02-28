import tkinter as tk
from tkinter import messagebox
from controller.StudentController import StudentController
from model.Student import Student

class AddStudentView:
    def __init__(self, root, return_to_menu_callback):
        self.controller = StudentController()
        self.root = root
        self.root.title("Add Student")
        self.root.geometry("800x600")  # Set a proper window size

        self.id_label = tk.Label(root, text="ID")
        self.id_label.pack(pady=5)
        self.id_entry = tk.Entry(root)
        self.id_entry.pack(pady=5)

        self.name_label = tk.Label(root, text="Name")
        self.name_label.pack(pady=5)
        self.name_entry = tk.Entry(root)
        self.name_entry.pack(pady=5)

        self.lastName_label = tk.Label(root, text="Last Name")
        self.lastName_label.pack(pady=5)
        self.lastName_entry = tk.Entry(root)
        self.lastName_entry.pack(pady=5)

        self.add_button = tk.Button(root, text="Add", command=self.add_student)
        self.add_button.pack(pady=20)

        self.message_label = tk.Label(root, text="")
        self.message_label.pack(pady=5)

        self.return_button = tk.Button(root, text="Return to Menu", command=return_to_menu_callback)
        self.return_button.pack(pady=20)

    def add_student(self):
        student = Student(self.id_entry.get(), self.name_entry.get(), self.lastName_entry.get())
        result = self.controller.addStudent(student)
        self.message_label.config(text=result)
        messagebox.showinfo("Result", result)
