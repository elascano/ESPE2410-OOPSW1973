from pymongo import MongoClient

def calculate_Volume():
    client = MongoClient("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/")
    db = client["VolumeCalculator"]
    collection = db["Volume"]

    dimensions = collection.find()

    for dimension in dimensions:
        length = dimension.get("Long", 0)
        width = dimension.get("Width", 0)
        height = dimension.get("High", 0)
        
        volume = length * width * height
        print(f"El volumen para el ID {dimension.get('ID')} es: {volume:.2f}")

    client.close()

calculate_Volume()