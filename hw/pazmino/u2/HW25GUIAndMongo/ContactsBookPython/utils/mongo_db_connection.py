from pymongo import MongoClient
from datetime import datetime
from typing import List
try:
    from ec.edu.espe.contact_book.model.contact import Contact 
except ImportError:
    from ec.edu.espe.contact_book.model.contact import Contact  

class MongoConnection:
    
    _client = None  # Cliente MongoDB como variable estática
    
    @staticmethod
    def get_database():
        """Devuelve la instancia de la base de datos OOP."""
        if MongoConnection._client is None:
            MongoConnection._client = MongoClient("mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/")
        return MongoConnection._client["OOP"]

class MongoDbManager:
    
    @staticmethod
    def connect():
        database = MongoConnection.get_database()
        return database["CONTACTSBOOK"]

    @staticmethod
    def add(contact):
    
        collection = MongoDbManager.connect()
        
        try:
            if isinstance(contact, Contact):
                collection.insert_one(contact.to_dict())  # Usa el método to_dict() de Contact
                return True
        except Exception as ex:
            print(f"Error al guardar el contacto: {ex}")
        
        return False
