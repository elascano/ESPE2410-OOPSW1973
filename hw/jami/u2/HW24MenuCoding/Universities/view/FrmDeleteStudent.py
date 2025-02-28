import tkinter as tk
from tkinter import messagebox
from tkinter import ttk
from controller.StudentController import StudentController

class DeleteStudentView:
    def __init__(self, root, return_to_menu_callback):
        self.controller = StudentController()
        self.root = root
        self.root.title("Delete Student")
        self.root.geometry("800x600")  # Establecer un tamaño de ventana adecuado

        self.refresh_button = tk.Button(root, text="Refresh Table", command=self.refresh_table)
        self.refresh_button.pack(pady=20)

        self.tree = ttk.Treeview(root, columns=("ID", "Name", "Last Name", "Grades"), show="headings")
        self.tree.heading("ID", text="ID")
        self.tree.heading("Name", text="Name")
        self.tree.heading("Last Name", text="Last Name")
        self.tree.heading("Grades", text="Grades")
        self.tree.pack(pady=20)

        self.delete_button = tk.Button(root, text="Delete Selected Record", command=self.delete_record)
        self.delete_button.pack(pady=20)

        self.message_label = tk.Label(root, text="")
        self.message_label.pack(pady=5)

        self.return_button = tk.Button(root, text="Return to Menu", command=return_to_menu_callback)
        self.return_button.pack(pady=20)

        self.refresh_table()

    def refresh_table(self):
        # Limpiar la tabla
        for row in self.tree.get_children():
            self.tree.delete(row)
        # Obtener todos los estudiantes y agregarlos a la tabla
        students = self.controller.getAllStudents()
        for student in students:
            self.tree.insert("", "end", values=(student.get_id(), student.get_name(), student.get_lastName(), ",".join(map(str, student.get_grades()))))

    def delete_record(self):
        # Obtener el elemento seleccionado en la tabla
        selected_item = self.tree.selection()
        if not selected_item:
            messagebox.showerror("Error", "No record selected.")
            return

        student_id = self.tree.item(selected_item, "values")[0]
        confirm = messagebox.askyesno("Confirm Delete", f"Are you sure you want to delete student with ID {student_id}?")
        if confirm:
            result = self.controller.deleteStudent(student_id)
            self.message_label.config(text=result)
            messagebox.showinfo("Result", result)
            self.refresh_table()
