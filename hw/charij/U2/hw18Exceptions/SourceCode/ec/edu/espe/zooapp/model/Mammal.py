import Animal

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
