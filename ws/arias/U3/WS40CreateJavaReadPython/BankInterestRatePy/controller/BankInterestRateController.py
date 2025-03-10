from controller import MongoDBManager

class BankInterestRateController:
    def __init__(self, model):
        self.model = model

    def get_data(self):
        return self.model.get_all_data()