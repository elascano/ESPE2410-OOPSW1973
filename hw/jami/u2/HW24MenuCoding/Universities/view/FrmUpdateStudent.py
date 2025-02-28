import tkinter as tk
from tkinter import messagebox
from tkinter import ttk
from controller.StudentController import StudentController
from model.Student import Student

class UpdateStudentView:
    def __init__(self, root, return_to_menu_callback):
        # Inicializa la vista con varios componentes de la interfaz gráfica
        self.controller = StudentController()
        self.root = root
        self.root.title("Update Student")
        self.root.geometry("800x600")  # Establecer un tamaño de ventana adecuado

        self.refresh_button = tk.Button(root, text="Refresh Table", command=self.refresh_table)
        self.refresh_button.pack(pady=20)

        self.tree = ttk.Treeview(root, columns=("ID", "Name", "Last Name", "Grades"), show="headings")
        self.tree.heading("ID", text="ID")
        self.tree.heading("Name", text="Name")
        self.tree.heading("Last Name", text="Last Name")
        self.tree.heading("Grades", text="Grades")
        self.tree.pack(pady=20)

        self.update_button = tk.Button(root, text="Update Selected Record", command=self.update_record)
        self.update_button.pack(pady=20)

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

    def update_record(self):
        # Obtener el elemento seleccionado en la tabla
        selected_item = self.tree.selection()
        if not selected_item:
            messagebox.showerror("Error", "No record selected.")
            return

        student_id = self.tree.item(selected_item, "values")[0]
        student = self.controller.findStudentById(student_id)
        if not student:
            messagebox.showerror("Error", "Student not found.")
            return

        self.show_update_fields(student)

    def show_update_fields(self, student):
        update_window = tk.Toplevel(self.root)
        update_window.title("Update Student")
        update_window.geometry("400x300")

        id_label = tk.Label(update_window, text="ID")
        id_label.pack(pady=5)
        id_entry = tk.Entry(update_window)
        id_entry.insert(0, student.get_id())
        id_entry.pack(pady=5)

        name_label = tk.Label(update_window, text="Name")
        name_label.pack(pady=5)
        name_entry = tk.Entry(update_window)
        name_entry.insert(0, student.get_name())
        name_entry.pack(pady=5)

        lastName_label = tk.Label(update_window, text="Last Name")
        lastName_label.pack(pady=5)
        lastName_entry = tk.Entry(update_window)
        lastName_entry.insert(0, student.get_lastName())
        lastName_entry.pack(pady=5)

        grades_label = tk.Label(update_window, text="Grades (comma separated)")
        grades_label.pack(pady=5)
        grades_entry = tk.Entry(update_window)
        grades_entry.insert(0, ",".join(map(str, student.get_grades())))
        grades_entry.pack(pady=5)

        def update_student():
            new_id = id_entry.get()
            if new_id != student.get_id() and self.controller.findStudentById(new_id):
                messagebox.showerror("Error", "Student with this ID already exists.")
                return
            old_id = student.get_id()
            student.set_id(new_id)
            student.set_name(name_entry.get())
            student.set_lastName(lastName_entry.get())
            student.set_grades(list(map(int, grades_entry.get().split(","))))
            result = self.controller.updateStudent(student, old_id)
            self.message_label.config(text=result)
            messagebox.showinfo("Result", result)
            self.refresh_table()
            update_window.destroy()

        update_button = tk.Button(update_window, text="Update", command=update_student)
        update_button.pack(pady=20)
