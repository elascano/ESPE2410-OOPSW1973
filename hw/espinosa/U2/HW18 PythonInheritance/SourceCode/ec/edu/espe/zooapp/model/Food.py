class Food:
    def __init__(self,id,type,amount):
        self.id = id
        self.type = type
        self.amount = amount

    def display_info(self):
        print(f"Vaccine ID: {self.id}, type: {self.type}, amount: {self.amount}")