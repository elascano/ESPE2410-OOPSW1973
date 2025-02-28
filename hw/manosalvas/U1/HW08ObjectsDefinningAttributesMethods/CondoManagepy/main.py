from co_owner import CoOwner
from vehicle import Vehicle
from parking_space import ParkingSpace
from parking_lot import ParkingLot
from tenant import Tenant
from file_manager import save_json  # Solo importamos la función para guardar en JSON

class CondominiumManagement:
    @staticmethod
    def main():
        print("Hello, Condo Manage")

        # Solicitar datos de CoOwner
        co_owner_id = input("\nEnter CoOwner ID: ")
        co_owner_name = input("Enter CoOwner name: ")
        co_owner_address = input("Enter CoOwner address: ")
        co_owner_email = input("Enter CoOwner email: ")

        # Crear objeto CoOwner
        co_owner = CoOwner(co_owner_id, co_owner_name, co_owner_address, co_owner_email)
        print("CoOwner ->", co_owner)

        # Guardar datos en JSON
        co_owner_data = {"id": co_owner.id, "name": co_owner.name, "address": co_owner.address, "email": co_owner.email}
        save_json(co_owner_data, "coOwner")

        # Solicitar datos de Vehicle
        vehicle_id = input("\nEnter Vehicle ID: ")
        vehicle_owner = input("Enter Vehicle owner: ")
        vehicle_model = input("Enter Vehicle model: ")
        vehicle_status = input("Enter Vehicle status: ")
        vehicle_color = input("Enter Vehicle color: ")
        vehicle_type = input("Enter Vehicle type: ")
        parking_space_number = int(input("Enter parking space number: "))

        # Crear objeto Vehicle
        vehicle = Vehicle(vehicle_id, vehicle_owner, vehicle_model, vehicle_status, vehicle_color, vehicle_type, parking_space_number)
        print("Vehicle ->", vehicle)

        # Guardar datos de Vehicle en JSON
        vehicle_data = {"id": vehicle.id, "owner": vehicle.owner, "model": vehicle.model, "status": vehicle.status, "color": vehicle.color, "vehicle_type": vehicle.vehicle_type, "parking_space_number": vehicle.parking_space_number}
        save_json(vehicle_data, "vehicle")

        # Solicitar datos de ParkingSpace
        budget_id = input("\nEnter budget ID: ")
        year = int(input("Enter year: "))
        total_fee_collected = float(input("Enter total fee collected: "))
        maintenance_fund = float(input("Enter maintenance fund: "))
        monthly_fee = float(input("Enter monthly fee: "))
        balance = float(input("Enter balance: "))
        description = input("Enter description: ")

        # Crear objeto ParkingSpace
        parking_space = ParkingSpace(budget_id, year, total_fee_collected, maintenance_fund, monthly_fee, balance, description)
        print("ParkingSpace ->", parking_space)

        # Guardar datos de ParkingSpace en JSON
        parking_space_data = {"budget_id": parking_space.budget_id, "year": parking_space.year, "total_fee_collected": parking_space.total_fee_collected, "maintenance_fund": parking_space.maintenance_fund, "monthly_fee": parking_space.monthly_fee, "balance": parking_space.balance, "description": parking_space.description}
        save_json(parking_space_data, "parkingSpace")

        # Solicitar datos de ParkingLot
        space_number = int(input("\nEnter space number: "))
        is_occupied = input("Is the space occupied? (true/false): ").lower() == "true"

        # Crear objeto ParkingLot
        parking_lot = ParkingLot(space_number, is_occupied)
        print("ParkingLot ->", parking_lot)

        # Guardar datos de ParkingLot en JSON
        parking_lot_data = {"space_number": parking_lot.space_number, "is_occupied": parking_lot.is_occupied}
        save_json(parking_lot_data, "parkingLot")

        # Solicitar datos de Tenant
        tenant_id = int(input("\nEnter Tenant ID: "))
        tenant_name = input("Enter Tenant name: ")
        house_number = int(input("Enter Tenant house number: "))
        phone = int(input("Enter Tenant phone: "))
        payment_status = input("Has the Tenant paid? (true/false): ").lower() == "true"

        # Crear objeto Tenant
        tenant = Tenant(tenant_id, tenant_name, house_number, phone, payment_status)
        print("Tenant ->", tenant)

        # Guardar datos de Tenant en JSON
        tenant_data = {"tenant_id": tenant.tenant_id, "tenant_name": tenant.tenant_name, "house_number": tenant.house_number, "phone": tenant.phone, "payment_status": tenant.payment_status}
        save_json(tenant_data, "tenant")

        print("Data successfully saved!")

# Llamar al método main
if __name__ == "__main__":
    CondominiumManagement.main()
