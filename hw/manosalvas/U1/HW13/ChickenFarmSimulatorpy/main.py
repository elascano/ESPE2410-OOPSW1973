import json
import csv
from datetime import datetime

# Clase para representar el pollo (Chicken)
class Chicken:
    def __init__(self, id, name, color, born_on_date, not_molting):
        self.id = id
        self.name = name
        self.color = color
        self.born_on_date = born_on_date
        self.not_molting = not_molting
        self.compute_age_in_months()

    def compute_age_in_months(self):
        today = datetime.today()
        delta_years = today.year - self.born_on_date.year
        delta_months = today.month - self.born_on_date.month
        self.age_in_months = delta_years * 12 + delta_months

    def __str__(self):
        return f"Chicken{{id={self.id}, name={self.name}, color={self.color}, age_in_months={self.age_in_months}, born_on_date={self.born_on_date}, not_molting={self.not_molting}}}"

    def to_dict(self):
        return {
            'id': self.id,
            'name': self.name,
            'color': self.color,
            'age_in_months': self.age_in_months,
            'born_on_date': self.born_on_date.strftime('%Y-%m-%d'),
            'not_molting': self.not_molting
        }

# Función para guardar los datos en CSV
def save_to_csv(chicken, filename="chicken_data.csv"):
    with open(filename, mode='a', newline='') as file:
        writer = csv.DictWriter(file, fieldnames=["ID", "Name", "Color", "Age in Months", "Born On Date", "Not Molting"])
        if file.tell() == 0:  # Si el archivo está vacío, escribe los encabezados
            writer.writeheader()
        writer.writerow({
            "ID": chicken.id,
            "Name": chicken.name,
            "Color": chicken.color,
            "Age in Months": chicken.age_in_months,
            "Born On Date": chicken.born_on_date.strftime('%Y-%m-%d'),
            "Not Molting": chicken.not_molting
        })

# Función para guardar los datos en JSON
def save_to_json(chicken, filename="chicken_data.json"):
    try:
        with open(filename, mode='r+') as file:
            try:
                # Intentar cargar los datos existentes en el archivo
                data = json.load(file)
            except json.JSONDecodeError:
                # Si el archivo está vacío, inicializamos una lista vacía
                data = []

            # Agregar el nuevo pollo
            data.append(chicken.to_dict())

            # Volver al inicio del archivo y sobrescribirlo con los nuevos datos
            file.seek(0)
            json.dump(data, file, indent=4)

    except FileNotFoundError:
        # Si el archivo no existe, creamos uno nuevo
        with open(filename, mode='w') as file:
            data = [chicken.to_dict()]
            json.dump(data, file, indent=4)

# Función principal para ingresar datos y guardar
def main():
    # Solicitar datos del usuario
    print("Gabriel's Chicken Farm Simulator")

    id = int(input("Enter chicken id: "))
    name = input("Enter chicken name: ")
    color = input("Enter chicken color: ")

    year = int(input("Enter chicken born year: "))
    month = int(input("Enter chicken born month: "))
    day = int(input("Enter chicken born day: "))
    born_on_date = datetime(year, month, day)

    not_molting = input("Is the chicken molting? (yes/no): ").strip().lower() == "no"

    # Crear el objeto Chicken
    chicken = Chicken(id, name, color, born_on_date, not_molting)

    # Mostrar los detalles del pollo creado
    print("Created Chicken:", chicken)
    print("Age in months:", chicken.age_in_months)

    # Guardar los datos en CSV y JSON
    save_to_csv(chicken)
    save_to_json(chicken)

    print("Data saved to chicken_data.csv and chicken_data.json")

# Llamar a la función principal
if __name__ == "__main__":
    main()
