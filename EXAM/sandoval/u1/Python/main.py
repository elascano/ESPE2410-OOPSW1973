import json
import os

class Truck:
    def __init__(self, truck_id, wheels, seats, brand, family):
        self.truck_id = truck_id
        self.wheels = wheels
        self.seats = seats
        self.brand = brand
        self.family = family

    def show_info(self):
        print(f"Truck {self.truck_id}:")
        print(f"  Brand: {self.brand}")
        print(f"  Family: {self.family}")
        print(f"  Wheels: {self.wheels}")
        print(f"  Seats: {self.seats}")
    
    def update_seats(self, new_seats):
        self.seats = new_seats
        print(f"The number of seats for truck {self.truck_id} has been updated to {self.seats}.")

def load_trucks(filename="trucks.json"):
    if os.path.exists(filename):
        with open(filename, "r") as file:
            return json.load(file)
    else:
        return []

def save_trucks(trucks, filename="trucks.json"):
    with open(filename, "w") as file:
        json.dump(trucks, file, indent=4)

def add_truck():
    truck_id = input("Enter truck ID: ")
    wheels = int(input("Enter number of wheels: "))
    seats = int(input("Enter number of seats: "))
    brand = input("Enter truck brand: ")
    family = input("Enter truck family: ")

    truck = Truck(truck_id, wheels, seats, brand, family)
    return truck

def main():
    trucks = load_trucks() 

    if trucks:
        print("\nExisting trucks:")
        for truck_data in trucks:
            truck = Truck(**truck_data)
            truck.show_info()
    else:
        print("No trucks found.")

    truck = add_truck()
    trucks.append({
        "truck_id": truck.truck_id,
        "wheels": truck.wheels,
        "seats": truck.seats,
        "brand": truck.brand,
        "family": truck.family
    })
    
    save_trucks(trucks)


    truck.show_info()


if __name__ == "__main__":
    main()
