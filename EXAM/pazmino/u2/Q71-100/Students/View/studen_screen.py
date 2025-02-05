import tkinter as tk
from tkinter import messagebox
from Controller import student_controller  # Asegúrate de que esta clase esté implementada
from Model import Student  # Asegúrate de que esta clase esté implementad

class student_screen(tk.Tk):
    def __init__(self):
        super().__init__()
        self.Controller= student_controller()
        self.init_components()

    def init_components(self):
        self.title("Students Form")
        self.geometry("400x200")

        self.jPanel1 = tk.Frame(self)
        self.jPanel1.pack(pady=20)

        self.txtID = tk.Entry(self.jPanel1)
        self.txtID.grid(row=0, column=1, padx=5, pady=5)
        tk.Label(self.jPanel1, text="ID:").grid(row=0, column=0)

        self.txtName = tk.Entry(self.jPanel1)
        self.txtName.grid(row=1, column=1, padx=5, pady=5)
        tk.Label(self.jPanel1, text="Name:").grid(row=1, column=0)

        self.txtSignature = tk.Entry(self.jPanel1)
        self.txtSignature.grid(row=2, column=1, padx=5, pady=5)
        tk.Label(self.jPanel1, text="Signature:").grid(row=2, column=0)

        self.txtCareer = tk.Entry(self.jPanel1)
        self.txtCareer.grid(row=3, column=1, padx=5, pady=5)
        tk.Label(self.jPanel1, text="Career:").grid(row=3, column=0)

        self.btnRead = tk.Button(self.jPanel1, text="Read", command=self.btn_read_action)
        self.btnRead.grid(row=4, column=0, columnspan=2, pady=10)

    def btn_read_action(self):
        id = self.txtID.get()

        if not id:
            messagebox.showwarning("Advertencia", "Por favor, ingresa un ID para buscar.")
        else:
            student = self.controller.read_student(id)
            if student:
                self.txtName.delete(0, tk.END)
                self.txtName.insert(0, student.name)
                self.txtSignature.delete(0, tk.END)
                self.txtSignature.insert(0, student.signature)
                self.txtCareer.delete(0, tk.END)
                self.txtCareer.insert(0, student.career)
            else:
                messagebox.showinfo("Información", "Estudiante no encontrado.")

if __name__ == "__main__":
    app = StudentsFrm()
    app.mainloop()