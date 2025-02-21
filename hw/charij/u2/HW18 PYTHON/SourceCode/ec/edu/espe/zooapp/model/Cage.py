import Animal

class Cage:
    def __init__(self,id):
        self.id = id
        self.animals = []

    def add_vaccine(self,animal):
        self.animals.append(animal)
    
    def display_info(self):
        print(f"The Cage ({self.id}), has --> ")
        for animal in self.animals:
            animal.display_info()