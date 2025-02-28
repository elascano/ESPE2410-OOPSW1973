from typing import List
from datetime import date
from animal import Animal  # Ensure 'animal.py' contains the Animal class
from vaccine import Vaccine  # Ensure 'vaccine.py' contains the Vaccine class


class Mammal(Animal):
    def __init__(self, maximum_hair_size: float, mammary_glands_number: int, animal_id: int, name: str,
                 born_on_date: date, weight: float, sex: str, vaccines: List[Vaccine]):
        super().__init__(animal_id, name, born_on_date, weight, sex, vaccines)
        self.maximum_hair_size = maximum_hair_size
        self.mammary_glands_number = mammary_glands_number
        self.cage = None

    def assign_cage(self, cage):
        self.cage = cage
        cage.add_animal(self)

    def feed(self, food):
        print(f"Feeding {self.name} with {food.amount} kg of {food.food_type}.")

    def register(self):
        print(f"Registering mammal {self.name}.")

    def provide_vaccination(self, vaccine: Vaccine):
        self.vaccines.append(vaccine)
        print(f"Provided vaccine {vaccine} to {self.name}.")

    def __repr__(self):
        return (f"Mammal(maximum_hair_size={self.maximum_hair_size}, "
                f"mammary_glands_number={self.mammary_glands_number}, animal={super().__repr__()})")
