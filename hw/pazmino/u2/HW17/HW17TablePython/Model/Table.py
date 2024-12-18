import pickle

class Table:
    def__init__(self, material, quantity_table_legs, height, color):
        self.material = material
        self.quantity_table_legs = quantity_table_legs
        self.height = height
        self.color = color
        
        def__str__(self):
            return f"Table(material={self.material}, quantity_table_legs={self.quantity_table_legs}, height={self.height}, color={self.color})"
            
        def serialize(self, filename):
            with open(filename,'wb') as file:
                picke.dump(self,file)
                
        @staticmethod
        def deserialize(filename):
            with open(filename, 'rb') as file:
        return pickle.load(file)
