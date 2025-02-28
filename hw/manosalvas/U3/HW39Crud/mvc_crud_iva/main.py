from utils.mongodb_manager import MongoDBManager
from views.producto_app import ProductoApp
import tkinter as tk

MONGO_URI = "mongodb+srv://gamanosalvas:gamanosalvas@cluster0.w9mf0.mongodb.net/"
DB_NAME = "test_db"
COLLECTION_NAME = "producto_py"

db_manager = MongoDBManager(MONGO_URI, DB_NAME, COLLECTION_NAME)

root = tk.Tk()
app = ProductoApp(root, db_manager)
root.mainloop()
