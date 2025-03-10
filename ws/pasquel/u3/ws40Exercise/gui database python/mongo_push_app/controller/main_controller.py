# controller/main_controller.py
import tkinter as tk  # Agrega esta línea
from view.main_view import MainView
from view.create_object_view import CreateObjectView
from view.list_objects_view import ListObjectsView
from model.mongo_model import MongoModel

class MainController:
    def __init__(self, root):
        self.root = root
        self.model = MongoModel()
        self.main_view = MainView(root, self)

    def open_create_view(self):
        create_window = tk.Toplevel(self.root)  # Ahora tk está definido
        create_view = CreateObjectView(create_window, self)

    def open_list_view(self):
        list_window = tk.Toplevel(self.root)  # Ahora tk está definido
        list_view = ListObjectsView(list_window, self)

    def create_object(self, data):
        self.model.create_object(data)

    def list_objects(self):
        return self.model.list_objects()

#strategy python
#bubble sort 2 5
#insertion sort 6 10 
#quick sort 11+
#gui input elements to be sorted
#text field separated by commas
#every time an array is sorted saved in a mongo db collection
#show sorted array
