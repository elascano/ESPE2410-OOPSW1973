import tkinter as tk
from tkinter import messagebox
from ec.edu.espe.crudpython.controller.employee_controller import EmployeeController

class EmployeeWindow:
    def __init__(self):
        self.controller = EmployeeController()
        self.root = tk.Tk()
        self.root.title("Gestión de Empleados")

        # Entradas para datos del empleado
        tk.Label(self.root, text="Nombre:").grid(row=0, column=0)
        self.name_entry = tk.Entry(self.root)
        self.name_entry.grid(row=0, column=1)

        tk.Label(self.root, text="Cargo:").grid(row=1, column=0)
        self.position_entry = tk.Entry(self.root)
        self.position_entry.grid(row=1, column=1)

        tk.Label(self.root, text="Salario:").grid(row=2, column=0)
        self.salary_entry = tk.Entry(self.root)
        self.salary_entry.grid(row=2, column=1)

        # Botones para CRUD
        tk.Button(self.root, text="Agregar", command=self.add_employee).grid(row=3, column=0)
        tk.Button(self.root, text="Listar", command=self.list_employees).grid(row=3, column=1)
        tk.Button(self.root, text="Actualizar", command=self.update_employee).grid(row=4, column=0)
        tk.Button(self.root, text="Eliminar", command=self.delete_employee).grid(row=4, column=1)

        # Mostrar lista de empleados
        self.employee_listbox = tk.Listbox(self.root, width=50)
        self.employee_listbox.grid(row=5, column=0, columnspan=2)

    def add_employee(self):
        name = self.name_entry.get()
        position = self.position_entry.get()
        salary = self.salary_entry.get()
        if name and position and salary:
            self.controller.add_employee(name, position, float(salary))
            messagebox.showinfo("Éxito", "Empleado agregado exitosamente.")
            self.list_employees()
        else:
            messagebox.showerror("Error", "Todos los campos son obligatorios.")

    def list_employees(self):
        self.employee_listbox.delete(0, tk.END)
        employees = self.controller.get_employees()
        for emp in employees:
            self.employee_listbox.insert(tk.END, f"{emp['_id']} - {emp['name']} - {emp['position']} - ${emp['salary']}")

    def update_employee(self):
        selected_item = self.employee_listbox.curselection()
        if selected_item:
            employee_data = self.employee_listbox.get(selected_item).split(" - ")
            employee_id = employee_data[0]

            name = self.name_entry.get()
            position = self.position_entry.get()
            salary = self.salary_entry.get()

            self.controller.update_employee(employee_id, name, position, float(salary) if salary else None)
            messagebox.showinfo("Éxito", "Empleado actualizado.")
            self.list_employees()
        else:
            messagebox.showerror("Error", "Seleccione un empleado para actualizar.")

    def delete_employee(self):
        selected_item = self.employee_listbox.curselection()
        if selected_item:
            employee_data = self.employee_listbox.get(selected_item).split(" - ")
            employee_id = employee_data[0]

            self.controller.delete_employee(employee_id)
            messagebox.showinfo("Éxito", "Empleado eliminado.")
            self.list_employees()
        else:
            messagebox.showerror("Error", "Seleccione un empleado para eliminar.")

    def run(self):
        self.root.mainloop()


# Punto de entrada
if __name__ == "__main__":
    app = EmployeeWindow()
    app.run()
