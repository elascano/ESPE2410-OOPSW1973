# parking_lot.py
class ParkingLot:
    def __init__(self, space_number, is_occupied):
        self.space_number = space_number
        self.is_occupied = is_occupied
    
    def __str__(self):
        return f"ParkingLot(space_number={self.space_number}, is_occupied={self.is_occupied})"
