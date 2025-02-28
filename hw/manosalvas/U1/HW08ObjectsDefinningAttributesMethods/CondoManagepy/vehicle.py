# vehicle.py
class Vehicle:
    def __init__(self, id, owner, model, status, color, vehicle_type, parking_space_number):
        self.id = id
        self.owner = owner
        self.model = model
        self.status = status
        self.color = color
        self.vehicle_type = vehicle_type
        self.parking_space_number = parking_space_number
    
    def __str__(self):
        return f"Vehicle(id={self.id}, owner={self.owner}, model={self.model}, status={self.status}, color={self.color}, vehicle_type={self.vehicle_type}, parking_space_number={self.parking_space_number})"
