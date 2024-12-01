class House:
    def __init__(self, house_id=None):
        self.house_id = house_id

    def __str__(self):
        return f"House ID: {self.house_id}"
        