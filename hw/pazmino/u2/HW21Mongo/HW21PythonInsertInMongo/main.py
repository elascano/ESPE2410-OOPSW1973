from pymongo import MongoClient
from dotenv import load_dotenv
import os

load_dotenv()

def connect_to_mongodb():
    """Conectar a la base de datos MongoDB"""
    try:
        mongo_uri = os.getenv("MONGO_URI", "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/")
        client = MongoClient(mongo_uri)
        db = client["OOP"]  
        collection = db["STUDENTS"]  
        print("Conexión exitosa a MongoDB.")
        return collection
    except Exception as e:
        print(f"Error al conectar con MongoDB: {e}")
        return None

def insert_student(collection):
    """Insertar un nuevo estudiante en la base de datos"""
    print("\n--- Insertar Nuevo Estudiante ---")
    try:
        student_id = input("Ingrese el ID del estudiante: ")
        student_name = input("Ingrese el nombre del estudiante: ")
        student_age = int(input("Ingrese la edad del estudiante: "))
        student_course = input("Ingrese el curso del estudiante: ")

        student_data = {
            "id": student_id,
            "name": student_name,
            "age": student_age,
            "course": student_course
        }

        insert_result = collection.insert_one(student_data)
        if insert_result.acknowledged:
            print("Estudiante insertado correctamente.")
    except ValueError:
        print("Error: La edad debe ser un número entero.")
    except Exception as e:
        print(f"Error al insertar el estudiante: {e}")

def update_student(collection):
    """Actualizar datos de un estudiante existente"""
    print("\n--- Modificar Estudiante ---")
    try:
        student_id = input("Ingrese el ID del estudiante que desea modificar: ")
        
        student = collection.find_one({"id": student_id})
        if student:
            print(f"Estudiante encontrado: {student}")
            
            # Solicitar nuevos datos
            new_name = input("Ingrese el nuevo nombre del estudiante (deje vacío para no cambiar): ")
            new_age = input("Ingrese la nueva edad del estudiante (deje vacío para no cambiar): ")
            new_course = input("Ingrese el nuevo curso del estudiante (deje vacío para no cambiar): ")

            update_fields = {}
            if new_name:
                update_fields["name"] = new_name
            if new_age:
                try:
                    update_fields["age"] = int(new_age)
                except ValueError:
                    print("Error: La edad debe ser un número entero. Se mantendrá el valor actual.")
            if new_course:
                update_fields["course"] = new_course

            if update_fields:
                collection.update_one({"id": student_id}, {"$set": update_fields})
                print("Estudiante actualizado correctamente.")
            else:
                print("No se realizaron cambios.")
        else:
            print(f"No se encontró un estudiante con ID {student_id}.")
    except Exception as e:
        print(f"Error al actualizar el estudiante: {e}")

def main():
    """Función principal"""
    collection = connect_to_mongodb()
    if not collection:
        return

    while True:
        print("\n--- Menú Principal ---")
        print("1. Insertar estudiante")
        print("2. Modificar estudiante")
        print("3. Salir")
        option = input("Seleccione una opción: ")

        if option == "1":
            insert_student(collection)
        elif option == "2":
            update_student(collection)
        elif option == "3":
            print("Saliendo del programa.")
            break
        else:
            print("Opción no válida, por favor intente de nuevo.")

if __name__ == "__main__":
    main()
