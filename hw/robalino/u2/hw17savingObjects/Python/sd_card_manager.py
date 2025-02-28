import pickle
import os
from sd_card import SDCard


class SDCardManager:
   
    DATA_FILE = "sd_card_data.pkl"

    def __init__(self):
        self.sd_cards = self._load_data()

    def add_sd_card(self, sd_card: SDCard):
        if self.find_sd_card_by_id(sd_card.card_id):
            raise ValueError(f"An SD Card with ID {sd_card.card_id} already exists.")
        self.sd_cards.append(sd_card)
        self._save_data()
        print("SD Card added successfully.")

    def view_all_sd_cards(self):
        return self.sd_cards

    def update_sd_card(self, card_id: int, new_brand: str, new_storage: int, new_price: float):
        sd_card = self.find_sd_card_by_id(card_id)
        if not sd_card:
            raise ValueError(f"SD Card with ID {card_id} not found.")
        sd_card.brand = new_brand
        sd_card.storage = new_storage
        sd_card.price = new_price
        self._save_data()
        print("SD Card updated successfully.")

    def delete_sd_card(self, card_id: int):
        sd_card = self.find_sd_card_by_id(card_id)
        if not sd_card:
            raise ValueError(f"SD Card with ID {card_id} not found.")
        self.sd_cards.remove(sd_card)
        self._save_data()
        print("SD Card deleted successfully.")

    def find_sd_card_by_id(self, card_id: int):
        for sd_card in self.sd_cards:
            if sd_card.card_id == card_id:
                return sd_card
        return None

    def _save_data(self):
        with open(self.DATA_FILE, "wb") as file:
            pickle.dump(self.sd_cards, file)

    def _load_data(self):
        if not os.path.exists(self.DATA_FILE):
            return []
        try:
            with open(self.DATA_FILE, "rb") as file:
                return pickle.load(file)
        except (EOFError, pickle.PickleError):
            return []
