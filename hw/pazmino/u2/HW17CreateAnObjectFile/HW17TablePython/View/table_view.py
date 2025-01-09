class TableView:
    @staticmethod
    def display_table(table):
        print(table)

    @staticmethod
    def prompt_for_table_data():
        material = input("Ingrese el material de la mesa: ")
        quantity_table_legs = int(input("Ingrese la cantidad de patas de la mesa: "))
        height = float(input("Ingrese la altura de la mesa: "))
        color = input("Ingrese el color de la mesa: ")
        return material, quantity_table_legs, height, color

    @staticmethod
    def show_message(message):
        print(message)