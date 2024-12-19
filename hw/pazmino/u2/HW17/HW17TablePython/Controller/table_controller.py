from model.table import Table
from view.table_view import TableView

class TableController:
    def __init__(self):
        self.tables = []

    def create_table(self):
        """Crea una mesa tomando datos de la vista."""
        material, legs, height, color = TableView.prompt_for_table_data()
        table = Table(material, legs, height, color)
        self.tables.append(table)
        TableView.show_message("Mesa creada exitosamente!")

    def display_tables(self):
        """Muestra todas las mesas creadas."""
        if not self.tables:
            TableView.show_message("No hay mesas para mostrar.")
        else:
            for table in self.tables:
                TableView.display_table(table)

    def save_table(self, file_path: str, table_index: int):
        """Guarda una mesa específica en un archivo."""
        try:
            self.tables[table_index].serialize(file_path)
            TableView.show_message("Mesa guardada exitosamente en el archivo.")
        except IndexError:
            TableView.show_message("Índice de mesa no válido.")

    def load_table(self, file_path: str):
        """Carga una mesa desde un archivo."""
        try:
            table = Table.deserialize(file_path)
            self.tables.append(table)
            TableView.show_message("Mesa cargada exitosamente!")
        except FileNotFoundError:
            TableView.show_message("El archivo no existe.")