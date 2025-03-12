class USTax:
    _instance = None
    _tax_percentage = 0.2  # Default tax percentage

    def __init__(self, tax_percentage=None):
        if tax_percentage is not None:
            self.tax_percentage = tax_percentage
        else:
            self.tax_percentage = USTax._tax_percentage

    @classmethod
    def get_instance(cls):
        if cls._instance is None:
            cls._instance = USTax(cls._tax_percentage)
        return cls._instance

    @classmethod
    def set_instance(cls, new_instance):
        if new_instance is not None:
            cls._instance = new_instance
        else:
            raise ValueError("Instance cannot be null")

    def sales_total(self, subtotal):
        tax = subtotal * self.tax_percentage
        return subtotal + tax

    @property
    def tax_percentage(self):
        return self._tax_percentage

    @tax_percentage.setter
    def tax_percentage(self, value):
        self._tax_percentage = value
