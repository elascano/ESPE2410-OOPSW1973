class Vaccine:
    def __init__(self,id,descritption):
        self.id = id
        self.description = descritption
    
    def display_info(self):
        print(f"Vaccine ID: {self.id}, description: {self.description}")
        