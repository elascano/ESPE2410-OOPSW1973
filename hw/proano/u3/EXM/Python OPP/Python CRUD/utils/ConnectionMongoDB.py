from pymongo import MongoClient

client = MongoClient("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/")
db = client["GUI_Python"]
collection = db["Keyboard"]
