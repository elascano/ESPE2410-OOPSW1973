# File: person.py
class Person:
    def __init__(self, person_id, name, age):
        self.id = person_id
        self.name = name
        self.age = age

    def to_dict(self):
        return {"id": self.id, "name": self.name, "age": self.age}

    @staticmethod
    def from_dict(data):
        return Person(data['id'], data['name'], data['age'])

    def __str__(self):
        return f"Person(id={self.id}, name={self.name}, age={self.age})"
