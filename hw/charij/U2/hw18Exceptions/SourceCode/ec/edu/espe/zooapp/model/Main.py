from Animal import Animal
from Mammal import Mammal
from Vaccine import Vaccine
from Food import Food
from Cage import Cage
import datetime

if __name__ == "__main__":
    print("Hello World!")
    print("This is Andrés's zoo")

    animal_id = 1
    name = "Lucy"
    born_on_date = datetime.date(2024, 8, 21)
    weight = 0.5
    sex = 'f'

    vaccine_id = 1
    vaccine_name = "paracetamol"
    vaccine = Vaccine(vaccine_id, vaccine_name)
    vaccines = [vaccine]

    animal = Animal(animal_id, name, born_on_date, weight, sex)
    animal.add_vaccine(vaccine)
    print(f"animal --> {animal.display_info()}")

    hair_size = 50.5
    number_of_mammary_glands = 3

    mammal = Mammal(animal_id, name, born_on_date, weight, sex, "22 months")
    mammal.add_vaccine(vaccine)
    print(f"mammal --> {mammal.display_info()}")

    new_vaccine = Vaccine(3, "Ibuprofen")
    vaccines.append(new_vaccine)
    mammal.add_vaccine(new_vaccine)

    animals = [animal]

    mammal.feed(Food(1, 5.0, "Orange"))

    cage = Cage(3, animals)
    mammal.assign_cage(cage)

