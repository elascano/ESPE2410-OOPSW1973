from pymongo import MongoClient

def connect_to_mongo():
    try:
        # Conexión al servidor MongoDB Atlas
        client = MongoClient("mongodb+srv://gamanosalvas:gamanosalvas@cluster0.w9mf0.mongodb.net/?retryWrites=true&w=majority")
        
        # Seleccionar la base de datos
        db = client["OOP"]  
        return db
    except Exception as e:
        print(f"Error al conectar con MongoDB: {e}")
        return None

def insert_data(db):
    try:
        # Acceder a la colección 'datos_py' dentro de la base de datos 'OOP'
        collection = db["datos_py"]

        # Solicitar datos al usuario
        print("Ingresa los datos del documento a insertar:")
        name = input("Nombre: ")
        age = int(input("Edad: "))
        email = input("Email: ")

        # Crear el documento
        document = {
            "name": name,
            "age": age,
            "email": email
        }

        # Insertar documento en MongoDB
        result = collection.insert_one(document)
        print(f"Documento insertado con ID: {result.inserted_id}")
    except Exception as e:
        print(f"Error al insertar datos: {e}")

if __name__ == "__main__":
    # Conectar a MongoDB
    database = connect_to_mongo()
    
    if database is not None:  # Verificación de la conexión
        # Insertar datos proporcionados por el usuario
        insert_data(database)
