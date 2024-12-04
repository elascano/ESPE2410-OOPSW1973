import json
from model.chicken import Chicken
import os
from typing import List

class FileManager:
    DEFAULT_FILE_PATH = "chickens.json"

    @staticmethod
    def save(chickens: List[Chicken], file_name=DEFAULT_FILE_PATH):
        """
        Guarda una lista de objetos `Chicken` en un archivo JSON.
        """
        try:
            with open(file_name, "w") as file:
                json.dump([chicken.__dict__ for chicken in chickens], file, indent=4)
            print(f"Data saved in {file_name}")
        except IOError as e:
            print(f"Error saving data: {e}")

    @staticmethod
    def read(file_name=DEFAULT_FILE_PATH) -> List[Chicken]:
        """
        Lee una lista de objetos `Chicken` desde un archivo JSON. Si el archivo no existe o está vacío, retorna una lista vacía.
        """
        chickens = []

        if not os.path.exists(file_name):
            print(f"File does not exist. Creating new file with an empty list.")
            FileManager.save(chickens, file_name)
            return chickens

        try:
            with open(file_name, "r") as file:
                json_data = file.read()
                if not json_data.strip():
                    print("File is empty. Starting with an empty list.")
                    return chickens

                chicken_list = json.loads(json_data)
                chickens = [Chicken(**data) for data in chicken_list]
                print(f"Successfully loaded {len(chickens)} chickens from {file_name}")
        except json.JSONDecodeError:
            print(f"Invalid JSON format in {file_name}. Renaming corrupt file and creating a new one.")
            os.rename(file_name, file_name + ".corrupt")
            FileManager.save(chickens, file_name)
        except IOError as e:
            print(f"Error reading file: {e}")

        return chickens
