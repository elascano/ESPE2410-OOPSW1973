from datetime import date
from typing import List
from vaccine import Vaccine
from animal import Animal
from food import Food  
from cage import Cage
from mammal import Mammal




def main():
    print("Hello World!")
    print("This is Benjamin's Zoo")

    # Gather Animal data from user
    animal_id = int(input("Enter animal ID: "))
    name = input("Enter animal name: ")
    born_on_date = input("Enter the animal's birth date (YYYY-MM-DD): ")
    weight = float(input("Enter animal weight (in kg): "))
    sex = input("Enter animal sex (m/f): ").lower()

    # Convert born_on_date to a Python date object
    born_on_date = date.fromisoformat(born_on_date)

    # Create Vaccines
    vaccines: List[Vaccine] = []
    while True:
        add_vaccine = input("Do you want to add a vaccine? (yes/no): ").lower()
        if add_vaccine == "no":
            break
        try:
            vaccine_id = int(input("Enter vaccine ID: "))
            description = input("Enter vaccine description: ")
            vaccines.append(Vaccine(vaccine_id, description))
        except ValueError:
            print("Invalid vaccine ID. Please enter a numeric value.")

    # Create Animal
    animal = Animal(animal_id, name, born_on_date, weight, sex, vaccines)
    print(f"\nCreated Animal: {animal}\n")

    # Create Mammal
    maximum_hair_size = float(input("Enter mammal's maximum hair size (in cm): "))
    mammary_glands_number = int(input("Enter mammal's number of mammary glands: "))
    mammal = Mammal(maximum_hair_size, mammary_glands_number, animal_id, name, born_on_date, weight, sex, vaccines)
    print(f"\nCreated Mammal: {mammal}\n")

    # Create Cage and assign Mammal
    cage_id = int(input("Enter cage ID: "))
    cage = Cage(cage_id, [])
    mammal.assign_cage(cage)
    print(f"\nMammal assigned to Cage: {cage}\n")

    # Feed Mammal
    food_id = int(input("Enter food ID: "))
    food_amount = float(input("Enter food amount: "))
    food_type = input("Enter food type: ")
    food = Food(food_id, food_amount, food_type)
    mammal.feed(food)

    # Register Mammal
    mammal.register()

    # Provide additional Vaccine
    vaccine_id = int(input("Enter new vaccine ID: "))
    vaccine_description = input("Enter new vaccine description: ")
    new_vaccine = Vaccine(vaccine_id, vaccine_description)
    mammal.provide_vaccination(new_vaccine)

    # Final Output
    print("\nFinal Details:")
    print(f"Mammal: {mammal}")
    print(f"Cage: {cage}")


if __name__ == "__main__":
    main()