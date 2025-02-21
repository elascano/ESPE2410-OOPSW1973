import Vaccine
import Food
import Cage

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
        cage.get_animals().append(self)

    def provide_vaccination(self, vaccine):
        print(f"Providing vaccine --> {vaccine} <-- to {self.name}")
        self.vaccines.append(vaccine)