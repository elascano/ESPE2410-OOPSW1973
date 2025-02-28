import tkinter as tk
from tkinter import messagebox
from models.producto import Producto

class ProductoApp:
    def __init__(self, root, db_manager):
        self.db_manager = db_manager
        self.root = root
        self.root.title("Gestión de Productos")
        
        
        self.opciones = ["Agregar Producto", "Ver Productos", "Actualizar Producto", "Eliminar Producto", "Salir"]
        
        self.listbox = tk.Listbox(root)
        for opcion in self.opciones:
            self.listbox.insert(tk.END, opcion)
        self.listbox.pack()
        
        self.listbox.bind("<<ListboxSelect>>", self.seleccionar_opcion)
    
    def seleccionar_opcion(self, event):
        seleccion = self.listbox.curselection()
        if seleccion:
            opcion = self.opciones[seleccion[0]]
            if opcion == "Agregar Producto":
                self.agregar_producto()
            elif opcion == "Ver Productos":
                self.ver_productos()
            elif opcion == "Actualizar Producto":
                self.actualizar_producto()
            elif opcion == "Eliminar Producto":
                self.eliminar_producto()
            elif opcion == "Salir":
                self.root.quit()
    
    def agregar_producto(self):
        nombre = input("Nombre del producto: ")
        precio = float(input("Precio del producto: "))
        producto = Producto(nombre, precio)
        self.db_manager.insert({"nombre": producto.nombre, "precio": producto.precio})
        messagebox.showinfo("Éxito", "Producto agregado correctamente")
    
    def ver_productos(self):
        productos = self.db_manager.get_all()
        for prod in productos:
            print(prod)
    
    def actualizar_producto(self):
        product_id = input("ID del producto a actualizar: ")
        nuevo_precio = float(input("Nuevo precio: "))
        self.db_manager.update(product_id, {"precio": nuevo_precio})
        messagebox.showinfo("Éxito", "Producto actualizado correctamente")
    
    def eliminar_producto(self):
        product_id = input("ID del producto a eliminar: ")
        self.db_manager.delete(product_id)
        messagebox.showinfo("Éxito", "Producto eliminado correctamente")
