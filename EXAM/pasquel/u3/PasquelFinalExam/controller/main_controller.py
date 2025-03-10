import tkinter as tk
from view.main_view import MainView
from view.create_object_view import CreateObjectView
from view.sorted_array_view import SortedArrayView 
from model.mongo_model import MongoModel
from controller.strategy import decide_sort

class MainController:
    def __init__(self, root):
        self.root = root
        self.model = MongoModel()
        self.main_view = MainView(root, self)

    def open_create_view(self):
        create_window = tk.Toplevel(self.root)
        create_view = CreateObjectView(create_window, self)

    def create_object(self, data):
        sorted_data = decide_sort(data['array'])
        data['array'] = sorted_data
        self.model.create_object(data)
        print(f"Array sorted with PasquelStrategy: {data['array']}")


        self.show_sorted_array(data['array'])

    def show_sorted_array(self, sorted_array):
        if len(sorted_array) <= 5:
            algorithm_name = " Bubble Sort"
        elif len(sorted_array) <= 10:
            algorithm_name = " Insertion Sort"
        else:
            algorithm_name = " Quick Sort"

        sorted_window = tk.Toplevel(self.root)
        sorted_view = SortedArrayView(sorted_window, sorted_array, algorithm_name)
