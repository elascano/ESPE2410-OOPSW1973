import tkinter as tk
from view.FrmFindStudent import SearchStudentView
from view.FrmAddStudent import AddStudentView
from view.FrmUpdateStudent import UpdateStudentView
from view.FrmDeleteStudent import DeleteStudentView

class Application:
    def __init__(self, root):
        self.root = root
        self.root.geometry("800x600")  # Establecer un tamaño de ventana adecuado
        self.create_menu()

    def create_menu(self):
        # Destruir todos los widgets existentes en la ventana raíz
        for widget in self.root.winfo_children():
            widget.destroy()
        # Crear un menú principal
        menu = tk.Menu(self.root)
        self.root.config(menu=menu)

        # Crear un submenú para las opciones de estudiantes
        student_menu = tk.Menu(menu)
        menu.add_cascade(label="Student", menu=student_menu)
        student_menu.add_command(label="Search Student", command=self.show_search_student)
        student_menu.add_command(label="Add Student", command=self.show_add_student)
        student_menu.add_command(label="Update Student", command=self.show_update_student)
        student_menu.add_command(label="Delete Student", command=self.show_delete_student)

    def show_search_student(self):
        # Destruir todos los widgets existentes en la ventana raíz
        for widget in self.root.winfo_children():
            widget.destroy()
        # Mostrar la vista de búsqueda de estudiantes
        SearchStudentView(self.root, self.create_menu)

    def show_add_student(self):
        # Destruir todos los widgets existentes en la ventana raíz
        for widget in self.root.winfo_children():
            widget.destroy()
        # Mostrar la vista de agregar estudiantes
        AddStudentView(self.root, self.create_menu)

    def show_update_student(self):
        # Destruir todos los widgets existentes en la ventana raíz
        for widget in self.root.winfo_children():
            widget.destroy()
        # Mostrar la vista de actualizar estudiantes
        UpdateStudentView(self.root, self.create_menu)

    def show_delete_student(self):
        # Destruir todos los widgets existentes en la ventana raíz
        for widget in self.root.winfo_children():
            widget.destroy()
        # Mostrar la vista de eliminar estudiantes
        DeleteStudentView(self.root, self.create_menu)
