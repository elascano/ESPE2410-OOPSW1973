from controller import MongoDBManager
from view import FrmBankInterestRate
from controller import BankInterestRateController

def main():
    controller = MongoDBManager()
    controller = BankInterestRateController(controller)
    view = FrmBankInterestRate(controller)
    view.mainloop()

if __name__ == "__main__":
    main()
