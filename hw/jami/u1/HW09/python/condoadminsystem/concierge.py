class Concierge:
    def __init__(self, name=None):
        self.name = name

    def __str__(self):
        return f"Concierge Name: {self.name}"