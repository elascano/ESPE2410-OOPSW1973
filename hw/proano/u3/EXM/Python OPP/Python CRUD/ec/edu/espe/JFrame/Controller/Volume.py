from tkinter import messagebox
import utils.ConnectionMongoDB
import View.FrmKeyboard

# Función para guardar en MongoDB
def guardar_datos():
    try:
        teclado = {
            "id": int(txtId.get()),
            "quantity": int(txtQuantity.get()),
            "marca": txtBrand.get(),
            "tipo": txtType.get(),
            "precio": float(txtPrice.get())
        }
        collection.insert_one(teclado)
        messagebox.showinfo("Éxito", "Teclado guardado correctamente.")
    except ValueError:
        messagebox.showerror("Error", "Datos inválidos. Verifique los campos.")

# Función para eliminar en MongoDB
def eliminar_teclado():
    def confirmar_eliminacion():
        try:
            id_teclado = int(txtEliminarId.get())
            resultado = collection.delete_one({"id": id_teclado})
            if resultado.deleted_count > 0:
                messagebox.showinfo("Éxito", "Se eliminó correctamente.")
                eliminar_ventana.destroy()
            else:
                messagebox.showwarning("Error", "No se encontró el teclado con ese ID.")
        except ValueError:
            messagebox.showerror("Error", "Ingrese un ID válido.")

    eliminar_ventana = Toplevel(ppanel)
    eliminar_ventana.title("Eliminar teclado")
    eliminar_ventana.geometry("400x200")
    eliminar_ventana.resizable(False, False)

    Label(eliminar_ventana, text="Ingrese el ID a eliminar:", font=("Segoe UI", 12)).pack(pady=10)
    txtEliminarId = Entry(eliminar_ventana)
    txtEliminarId.pack(pady=5)

    Button(eliminar_ventana, text="Confirmar eliminación", command=confirmar_eliminacion).pack(pady=20)
    Button(eliminar_ventana, text="Cancelar", command=eliminar_ventana.destroy).pack(pady=5)

# Función para buscar en MongoDB
def buscar_teclado():
    def confirmar_busqueda():
        try:
            id_teclado = int(txtBuscarId.get())
            teclado = collection.find_one({"id": id_teclado})
            if teclado:
                mostrar_datos(teclado)
            else:
                messagebox.showwarning("Error", "No se encontró el teclado con ese ID.")
        except ValueError:
            messagebox.showerror("Error", "Ingrese un ID válido.")

    def mostrar_datos(teclado):
        datos_ventana = Toplevel(ppanel)
        datos_ventana.title("Datos del Teclado")
        datos_ventana.geometry("300x250")
        datos_ventana.resizable(False, False)

        Label(datos_ventana, text=f"ID: {teclado['id']}", font=("Segoe UI", 12)).pack(pady=5)
        Label(datos_ventana, text=f"Cantidad: {teclado['quantity']}", font=("Segoe UI", 12)).pack(pady=5)
        Label(datos_ventana, text=f"Marca: {teclado['marca']}", font=("Segoe UI", 12)).pack(pady=5)
        Label(datos_ventana, text=f"Tipo: {teclado['tipo']}", font=("Segoe UI", 12)).pack(pady=5)
        Label(datos_ventana, text=f"Precio: {teclado['precio']}", font=("Segoe UI", 12)).pack(pady=5)

        Button(datos_ventana, text="OK", command=datos_ventana.destroy).pack(pady=20)

    buscar_ventana = Toplevel(ppanel)
    buscar_ventana.title("Buscar teclado")
    buscar_ventana.geometry("400x200")
    buscar_ventana.resizable(False, False)

    Label(buscar_ventana, text="Ingrese el ID a buscar:", font=("Segoe UI", 12)).pack(pady=10)
    txtBuscarId = Entry(buscar_ventana)
    txtBuscarId.pack(pady=5)

    Button(buscar_ventana, text="Confirmar búsqueda", command=confirmar_busqueda).pack(pady=20)
    Button(buscar_ventana, text="Cancelar", command=buscar_ventana.destroy).pack(pady=5)