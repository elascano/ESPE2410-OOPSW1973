from pymongo import MongoClient
from datetime import datetime
from typing import List
try:
    from ec.edu.espe.contact_book.model.contact import Contact 
except ImportError:
    from ec.edu.espe.contact_book.model.contact import Contact  # Alternativa si el modelo está en el mismo directorio

class MongoConnection:
    """Clase para manejar la conexión a MongoDB."""
    
    _client = None  # Cliente MongoDB como variable estática
    
    @staticmethod
    def get_database():
        """Devuelve la instancia de la base de datos OOP."""
        if MongoConnection._client is None:
            MongoConnection._client = MongoClient("mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/")
        return MongoConnection._client["OOP"]

class MongoDbManager:
    """Clase para gestionar operaciones en la base de datos."""
    
    @staticmethod
    def connect():
        """Obtiene la colección CONTACTSBOOK de la base de datos OOP."""
        database = MongoConnection.get_database()
        return database["CONTACTSBOOK"]

    @staticmethod
    def add(contact):
        """Agrega un contacto a la base de datos."""
        collection = MongoDbManager.connect()
        
        try:
            if isinstance(contact, Contact):
                collection.insert_one(contact.to_dict())  # Usa el método to_dict() de Contact
                return True
        except Exception as ex:
            print(f"Error al guardar el contacto: {ex}")
        
        return False
