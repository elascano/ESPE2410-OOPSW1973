import datetime

class Animal:
    def __init__(self,id,name,born_on_date,weight,sex,):
        self.id = id
        self.name = name
        self.born_on_date = born_on_date
        self.weight = weight
        self.sex = sex
        self.vaccines = []

    def add_vaccine(self,vaccine):
        self.vaccines.append(vaccine)

    def display_info(self):
        print(f"Animal ID: {self.id}")
        print(f"Animal name: {self.name}")
        print(f"Animal born date : {self.born_on_date}")
        print(f"Animal weight: {self.weight}")
        print(f"Animal sex: {self.sex}")
        print(f"Vaccines: ")
        for vaccine in self.vaccines:
            vaccine.display_info()

    def feed(self, food):
        print(f"Feeding the animal {self.name} with --> {food}")

    def register(self):
        print("Register animal")

    def assign_cage(self, cage):
        # TODO: assign an animal to a cage
        print(f"Assigning an animal to cage --> {cage}")
        cage.add_animal(cage)

    def provide_vaccination(self, vaccine):
        print(f"Providing vaccine --> {vaccine} <-- to {self.name}")
        self.vaccines.append(vaccine)

class Cage:
    def __init__(self,id,):
        self.id = id
        self.animals = []

    def add_animal(self,animal):
        self.animals.append(animal)
    
    def display_info(self):
        print(f"The Cage ({self.id}), has --> ")
        for animal in self.animals:
            animal.display_info()

class Food:
    def __init__(self,id,type,amount):
        self.id = id
        self.type = type
        self.amount = amount

    def display_info(self):
        print(f"Vaccine ID: {self.id}, type: {self.type}, amount: {self.amount}")

class Vaccine:
    def __init__(self,id,descritption):
        self.id = id
        self.description = descritption
    
    def display_info(self):
        print(f"Vaccine ID: {self.id}, description: {self.description}")

class Mammal(Animal):
    def __init__(self, maximum_hair_size, mamary_glands_number, id, name, born_on_date, weight, sex):
        super().__init__(id, name, born_on_date, weight, sex)
        self.maximum_hair_size = maximum_hair_size
        self.mamary_glands_number = mamary_glands_number

    def breastfeed(self):
        print("breastfeeding the children")

    def display_info(self):
        super().display_info()
        print(f"Maximum Hair Size: {self.maximum_hair_size}")
        print(f"Mamary Glands Number: {self.mamary_glands_number}")

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

    mammal = Mammal(50.4,5, animal_id, name, born_on_date, weight, sex)
    mammal.add_vaccine(vaccine)
    print(f"mammal --> {mammal.display_info()}")

    new_vaccine = Vaccine(3, "Ibuprofen")
    vaccines.append(new_vaccine)
    mammal.add_vaccine(new_vaccine)

    animals = [animal]

    mammal.feed(Food(1, 5.0, "Mouse"))

    cage = Cage(3)
    cage.add_animal(animal)
    mammal.assign_cage(cage)