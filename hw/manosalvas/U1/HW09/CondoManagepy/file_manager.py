# file_manager.py
import json

def save_json(data, filename):
    with open(f"{filename}.json", mode="a") as file:
        json.dump(data, file, indent=4)
        file.write("\n")
