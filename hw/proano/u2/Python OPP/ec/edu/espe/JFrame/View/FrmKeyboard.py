from tkinter import *
from pymongo import MongoClient
from tkinter import messagebox

client = MongoClient("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/")
db = client["GUI_Python"]
collection = db["Keyboard"]

def guardar_datos():
    try:
        teclado = {
            "id": int(txtId.get()),
            "marca": txtBrand.get(),
            "tipo": txtType.get(),
            "precio": float(txtPrice.get())
        }
        collection.insert_one(teclado)
        messagebox.showinfo("Éxito", "Teclado guardado correctamente.")
    except ValueError:
        messagebox.showerror("Error", "Datos inválidos. Verifique los campos.")

ppanel = Tk()
ppanel.title("Venta de teclados")
ppanel.resizable(False, False)
ppanel.geometry("540x280")

ppalFrame = Frame(ppanel, width="500", height="325")
ppalFrame.grid(row=0, column=0, padx=13, pady=0)
ppalFrame.config(bd=5, relief="groove")

DtaFrame = LabelFrame(ppalFrame, text="Teclados disponibles", font=("Segoe UI", 18, "bold italic"), padx=0, pady=0)
DtaFrame.grid(row=0, column=0, padx=30, pady=10)

IdLabel = Label(DtaFrame, text="Ingrese el ID: ", width=13, font=("Segoe UI", 11, "italic")).grid(row=0, column=0)
txtId = Entry(DtaFrame)
txtId.grid(row=0, column=1, padx=45, pady=10)

brandLabel = Label(DtaFrame, text="Marca: ", width=15, font=("Segoe UI", 11, "italic")).grid(row=1, column=0)
txtBrand = Entry(DtaFrame)
txtBrand.grid(row=1, column=1, pady=10)

typeLabel = Label(DtaFrame, text="Tipo: ", width=15, font=("Segoe UI", 11, "italic")).grid(row=2, column=0)
txtType = Entry(DtaFrame)
txtType.grid(row=2, column=1, pady=10)

priceLabel = Label(DtaFrame, text="Precio: ", width=15, font=("Segoe UI", 11, "italic")).grid(row=3, column=0)
txtPrice = Entry(DtaFrame)
txtPrice.grid(row=3, column=1, pady=10)

Button(DtaFrame, text="Guardar", width=10, command=guardar_datos).grid(row=4, column=0, pady=15)
Button(DtaFrame, text="Eliminar", width=10).grid(row=4, column=1)
Button(DtaFrame, text="Actualizar", width=10).grid(row=4, column=2, padx=10)






ppanel.mainloop()