import pickle

class Table:
    def __init__(self, material: str, quantity_table_legs: int, height: float, color: str):
        self.material = material
        self.quantity_table_legs = quantity_table_legs
        self.height = height
        self.color = color

    def __str__(self):
        return (
            f"Table{{\n"
            f"  material={self.material},\n"
            f"  quantity_table_legs={self.quantity_table_legs},\n"
            f"  height={self.height},\n"
            f"  color={self.color}\n"
            f"}}"
        )

    def serialize(self, file_path: str):
        """Guardar la instancia como un archivo usando pickle."""
        with open(file_path, 'wb') as file:
            pickle.dump(self, file)

    @staticmethod
    def deserialize(file_path: str):
        """Cargar una instancia desde un archivo usando pickle."""
        with open(file_path, 'rb') as file:
            return pickle.load(file)