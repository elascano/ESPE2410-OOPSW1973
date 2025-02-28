import tkinter as tk
from view.FrmFindStudent import SearchStudentView
from view.FrmAddStudent import AddStudentView
from view.Application import Application  # Importar la clase Application

def main():
    # Crear la ventana raíz de Tkinter
    root = tk.Tk()
    root.geometry("600x400")
    # Crear una instancia de la aplicación
    app = Application(root)
    # Iniciar el bucle principal de la interfaz gráfica
    root.mainloop()

if __name__ == "__main__":
    main()
