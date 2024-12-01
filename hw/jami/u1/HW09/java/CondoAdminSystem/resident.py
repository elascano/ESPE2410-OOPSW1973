class Resident:
    def __init__(self, name=None, apartment=None):
        self.name = name
        self.apartment = apartment

    def __str__(self):
        return f"Resident Name: {self.name}, Apartment: {self.apartment}"