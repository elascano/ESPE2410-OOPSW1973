import json
from datetime import datetime
from model.chicken import Chicken


class FileManager:
    DEFAULT_FILE_PATH = "chickens.json"

    @staticmethod
    def save(chickens, file_name=None):
        """
        Guarda una lista de objetos Chicken en un archivo JSON.
        """
        if file_name is None:
            file_name = FileManager.DEFAULT_FILE_PATH
        with open(file_name, "w", encoding="utf-8") as file:
            json_list = [chicken.get_dict() for chicken in chickens]
            json.dump(json_list, file, indent=4)
        print(f"Data saved in {file_name}")

    @staticmethod
    def read(file_name=None):
        """
        Lee una lista de objetos Chicken desde un archivo JSON y la convierte en objetos Chicken.
        """
        if file_name is None:
            file_name = FileManager.DEFAULT_FILE_PATH

        try:
            with open(file_name, "r", encoding="utf-8") as file:
                data = json.load(file)
                chickens = []
                for chicken_dict in data:
                    # Convertir `bornOnDate` a un objeto `date` si existe
                    chicken_dict['born_on_date'] = (
                        datetime.strptime(chicken_dict['born_on_date'], "%Y-%m-%d").date()
                        if chicken_dict.get('born_on_date')
                        else None
                    )
                    # Mapear `ageInMonths` a `age_in_months`
                    chicken_dict['age_in_months'] = chicken_dict.pop('ageInMonths', None)
                    # Crear objetos Chicken a partir de los datos
                    chicken = Chicken(**chicken_dict)
                    chickens.append(chicken)
                print(f"Successfully loaded {len(chickens)} chickens from {file_name}")
                return chickens
        except FileNotFoundError:
            print(f"File {file_name} not found. Returning an empty list.")
            return []
        except json.JSONDecodeError:
            print(f"Invalid JSON format in {file_name}. Returning an empty list.")
            return []
