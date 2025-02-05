from typing import List


class Cage:
    
    def __init__(self, cage_id: int, animals: list):
        self.cage_id = cage_id
        self.animals = animals  # List to hold assigned animals

    def add_animal(self, animal):
        self.animals.append(animal)  # Add animal to the cage
        print(f"Animal {animal.name} added to cage {self.cage_id}.")

    def __repr__(self):
        return f"Cage(id={self.cage_id}, animals={[animal.name for animal in self.animals]})"


    

    @property
    def id(self) -> int:
        return self._id

    @id.setter
    def id(self, value: int):
        self._id = value

    @property
    def animals(self) -> List['Animal']:
        return self._animals

    @animals.setter
    def animals(self, value: List['Animal']):
        self._animals = value
