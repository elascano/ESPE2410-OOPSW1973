class SDCard:
    
    def __init__(self, card_id: int, brand: str, storage: int, price: float):
        self.card_id = card_id
        self.brand = brand
        self.storage = storage  
        self.price = price  

    def __str__(self):
        return f"ID: {self.card_id} | Brand: {self.brand} | Storage: {self.storage}GB | Price: ${self.price:.2f}"
