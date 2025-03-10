from pymongo import MongoClient
from pymongo.server_api import ServerApi

def get_database():
    uri = "mongodb+srv://rchapigo:1234@cluster0.0etpp.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
    client = MongoClient(uri, server_api=ServerApi('1'))
    db = client['BonillaStrategy']  
    return db['BonillaSortedArray']  
