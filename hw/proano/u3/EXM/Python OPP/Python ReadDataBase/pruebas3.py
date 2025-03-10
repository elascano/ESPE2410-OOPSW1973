from pymongo import MongoClient

def calculate_Volume():
    # 🔗 Conectar a MongoDB
    client = MongoClient("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/")
    db = client["VolumeCalculator"]  # Base de datos
    collection = db["Volume"]  # Colección

    # Recuperar todas las dimensiones de los productos
    dimensions = collection.find()

    # Imprimir los valores y calcular el volumen de cada producto
    for dimension in dimensions:
        length = dimension.get("Long", 0)
        width = dimension.get("Width", 0)
        height = dimension.get("High", 0)
        
        # Calcular volumen de cada producto
        volume = length * width * height
        print(f"El volumen para el ID {dimension.get('ID')} es: {volume:.2f}")

    # Cerrar la conexión a MongoDB
    client.close()

# 🔥 Llamar a la función
calculate_Volume()