class Vehicle:
    def __init__(self, id="", owner=None, model="", status="", color="", type="", parking_space=None):
        self.id = id
        self.owner = owner
        self.model = model
        self.status = status
        self.color = color
        self.type = type
        self.parking_space = parking_space