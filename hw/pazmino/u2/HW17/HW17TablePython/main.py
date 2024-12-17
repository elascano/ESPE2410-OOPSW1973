from model import Table

class SaveObjectTable:
    def __init__(self):
        self.table = None

def create_table(self):
    material = "Caoba"
    cantidad_patas = 4
    altura = 1.2
    color = "Marrón"
    self.table = Table(material, cantidad_patas, altura, color)

self.table.serialize("table_data")

def show_table(self):
    loaded_table = Table.deserialize("table_data")
    print(f"Object loaded: {loaded_table}")

if __name__ == "__main__":
    view = TableView()
    view.create_table()  
    view.show_table()    
