# File: data_manager.py
import json
from person import Person

class DataManager:
    def __init__(self, file_path):
        self.file_path = file_path
        self.people = self.load_from_file()

    def load_from_file(self):
        try:
            with open(self.file_path, 'r') as file:
                data = json.load(file)
                return [Person.from_dict(person) for person in data]
        except FileNotFoundError:
            return []  # Start with an empty list if the file does not exist

    def save_to_file(self):
        with open(self.file_path, 'w') as file:
            json.dump([person.to_dict() for person in self.people], file)

    def add_person(self, person):
        self.people.append(person)
        self.save_to_file()

    def update_person(self, person_id, updated_person):
        self.people = [p for p in self.people if p.id != person_id]  # Remove existing person
        self.add_person(updated_person)

    def delete_person(self, person_id):
        self.people = [p for p in self.people if p.id != person_id]
        self.save_to_file()

    def search_by_id(self, person_id):
        for person in self.people:
            if person.id == person_id:
                return person
        return None

    def get_all_people(self):
        return self.people
