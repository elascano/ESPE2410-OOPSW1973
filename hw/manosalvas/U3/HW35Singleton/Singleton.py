class UsTax:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(UsTax, cls).__new__(cls)
            cls._instance.tax_rate = 0.15  # 15% de impuesto por defecto
        return cls._instance

    def calculate_tax(self, amount):
        return amount * self.tax_rate

    def set_tax_rate(self, new_rate):
        self.tax_rate = new_rate

class TaxView:
    @staticmethod
    def show_total(total):
        print(f"Total with tax: ${total:.2f}")

class TaxController:
    def __init__(self, tax_model, tax_view):
        self.tax_model = tax_model
        self.tax_view = tax_view

    def calculate_and_show_total(self, amount):
        total = amount + self.tax_model.calculate_tax(amount)
        self.tax_view.show_total(total)

if __name__ == "__main__":
    tax_model = UsTax()
    tax_view = TaxView()
    controller = TaxController(tax_model, tax_view)

    amount = float(input("Enter the amount: "))
    controller.calculate_and_show_total(amount)
