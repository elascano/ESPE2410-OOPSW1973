from controller.table_controller import TableController

def main():
    controller = TableController()
    while True:
        print("\n--- Menú de Gestión de Mesas ---")
        print("1. Crear una mesa")
        print("2. Mostrar mesas")
        print("3. Guardar una mesa en archivo")
        print("4. Cargar una mesa desde archivo")
        print("5. Salir")

        option = input("Seleccione una opción: ")

        if option == "1":
            controller.create_table()
        elif option == "2":
            controller.display_tables()
        elif option == "3":
            index = int(input("Ingrese el índice de la mesa a guardar: "))
            file_path = input("Ingrese la ruta del archivo: ")
            controller.save_table(file_path, index)
        elif option == "4":
            file_path = input("Ingrese la ruta del archivo: ")
            controller.load_table(file_path)
        elif option == "5":
            print("Saliendo del programa. ¡Adiós!")
            break
        else:
            print("Opción no válida. Intente de nuevo.")

if __name__ == "__main__":
    main()