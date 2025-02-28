from pymongo import MongoClient

client = MongoClient("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")

db = client['mi_base_de_datos']
collection = db['mi_coleccion']

def insertar_datos(nombre, edad):
    documento = {
        "nombre": nombre,
        "edad": edad
    }
    resultado = collection.insert_one(documento)
    print(f'Datos insertados con el id: {resultado.inserted_id}')

nombre = input("Ingrese su nombre: ")
edad = int(input("Ingrese su edad: "))

insertar_datos(nombre, edad)