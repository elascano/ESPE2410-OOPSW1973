import pickle
from model.table import Table

def main():
    file_name = "TableData.pkl"
    
    # Crear un objeto Table
    table = Table("Mahogany", 3, 1.2, "Brown")
    
    # Guardar el objeto Table en un archivo
    try:
        with open(file_name, 'wb') as file_out:
            pickle.dump(table, file_out)
            print(f"El objeto Table se ha guardado correctamente --> {file_name}")
    except IOError as e:
        print(f"Error al guardar el archivo --> {e}")

    # Cargar el objeto Table desde el archivo
    try:
        with open(file_name, 'rb') as file_in:
            loaded_table = pickle.load(file_in)
            print("El objeto se ha cargado correctamente:")
            print(loaded_table)
    except (IOError, pickle.PickleError) as e:
        print(f"Error al cargar el archivo --> {e}")

if __name__ == "__main__":
    main()