from datetime import datetime
from utils import MongoDbManager
from model import Contact

class ContactController:
    def __init__(self):
        self.collection = MongoDbManager.connect()  # Usa MongoDbManager para la conexión

    def add(self, contact):
        return MongoDbManager.add(contact)

    def find(self, find_string):
        favorite_sport = ["Chess"]
        date_of_birth = datetime(2020, 2, 1)  # 1 de febrero de 2020
        return Contact(3, "Brandon", 'm', "man", "single", date_of_birth, favorite_sport, "he has a problem")
