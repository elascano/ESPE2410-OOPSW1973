package ec.espe.edu.condomanage.view;

import ec.espe.edu.condomanage.model.CoOwner;
import ec.espe.edu.condomanage.model.ParkingLot;
import ec.espe.edu.condomanage.model.ParkingSpace;
import ec.espe.edu.condomanage.model.Tenant;
import ec.espe.edu.condomanage.model.Vehicle;
import utils.FileManager;

import java.util.Scanner;

public class CondominiumManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Título
        System.out.println("Hello, Condo Manage");

        // Solicitar datos de CoOwner
        System.out.println("\nEnter CoOwner information:");
        System.out.print("Enter CoOwner ID: ");
        String coOwnerId = scanner.nextLine();

        System.out.print("Enter CoOwner name: ");
        String coOwnerName = scanner.nextLine();

        System.out.print("Enter CoOwner address: ");
        String coOwnerAddress = scanner.nextLine();

        System.out.print("Enter CoOwner email: ");
        String coOwnerEmail = scanner.nextLine();

        // Crear el objeto CoOwner
        CoOwner coOwner = new CoOwner();
        coOwner.setId(coOwnerId);
        coOwner.setName(coOwnerName);
        coOwner.setAdress(coOwnerAddress);
        coOwner.setEmail(coOwnerEmail);

        System.out.println("CoOwner -> " + coOwner);

        // Guardar datos en CSV y JSON
        String coOwnerData = coOwnerId + "," + coOwnerName + "," + coOwnerAddress + "," + coOwnerEmail;
        FileManager.save(coOwnerData, "coOwner", "csv");
        FileManager.save(coOwnerData, "coOwner", "json");

        // Solicitar datos de Vehicle
        System.out.println("\nEnter Vehicle information:");
        System.out.print("Enter Vehicle ID: ");
        String vehicleId = scanner.nextLine();

        System.out.print("Enter Vehicle owner: ");
        String vehicleOwner = scanner.nextLine();

        System.out.print("Enter Vehicle model: ");
        String vehicleModel = scanner.nextLine();

        System.out.print("Enter Vehicle status: ");
        String vehicleStatus = scanner.nextLine();

        System.out.print("Enter Vehicle color: ");
        String vehicleColor = scanner.nextLine();

        System.out.print("Enter Vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter parking space number: ");
        int parkingSpaceNumber = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea restante

        // Crear el objeto Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleId);
        vehicle.setOwner(vehicleOwner);
        vehicle.setModel(vehicleModel);
        vehicle.setStatus(vehicleStatus);
        vehicle.setColor(vehicleColor);
        vehicle.setVehicleType(vehicleType);
        vehicle.setParkingSpaceNumber(parkingSpaceNumber);

        System.out.println("Vehicle -> " + vehicle);

        // Guardar datos de Vehicle en CSV y JSON
        String vehicleData = vehicleId + "," + vehicleOwner + "," + vehicleModel + "," + vehicleStatus + "," + vehicleColor + "," + vehicleType + "," + parkingSpaceNumber;
        FileManager.save(vehicleData, "vehicle", "csv");
        FileManager.save(vehicleData, "vehicle", "json");

        // Solicitar datos de ParkingSpace
        System.out.println("\nEnter ParkingSpace information:");
        System.out.print("Enter budget ID: ");
        String budgetId = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter total fee collected: ");
        double totalFeeCollected = scanner.nextDouble();

        System.out.print("Enter maintenance fund: ");
        double maintenanceFund = scanner.nextDouble();

        System.out.print("Enter monthly fee: ");
        double monthlyFee = scanner.nextDouble();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea restante

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        // Crear el objeto ParkingSpace
        ParkingSpace parkingSpace = new ParkingSpace();
        parkingSpace.setBudgetID(budgetId);
        parkingSpace.setYear(year);
        parkingSpace.setTotalFeeCollected(totalFeeCollected);
        parkingSpace.setMaintenceFund(maintenanceFund);
        parkingSpace.setMonthlyFee(monthlyFee);
        parkingSpace.setBalance(balance);
        parkingSpace.setDescription(description);

        System.out.println("ParkingSpace -> " + parkingSpace);

        // Guardar datos de ParkingSpace en CSV y JSON
        String parkingSpaceData = budgetId + "," + year + "," + totalFeeCollected + "," + maintenanceFund + "," + monthlyFee + "," + balance + "," + description;
        FileManager.save(parkingSpaceData, "parkingSpace", "csv");
        FileManager.save(parkingSpaceData, "parkingSpace", "json");

        // Solicitar datos de ParkingLot
        System.out.println("\nEnter ParkingLot information:");
        System.out.print("Enter space number: ");
        int spaceNumber = scanner.nextInt();

        System.out.print("Is the space occupied? (true/false): ");
        boolean isOccupied = scanner.nextBoolean();
        scanner.nextLine(); // Consumir salto de línea

        // Crear el objeto ParkingLot
        ParkingLot parkingLot = new ParkingLot(spaceNumber, isOccupied);  // Aquí está la corrección

        System.out.println("ParkingLot -> " + parkingLot);

        // Guardar datos de ParkingLot en CSV y JSON
        String parkingLotData = spaceNumber + "," + isOccupied;
        FileManager.save(parkingLotData, "parkingLot", "csv");
        FileManager.save(parkingLotData, "parkingLot", "json");

        // Solicitar datos de Tenant
        System.out.println("\nEnter Tenant information:");
        System.out.print("Enter Tenant ID: ");
        int tenantId = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Enter Tenant name: ");
        String tenantName = scanner.nextLine();

        System.out.print("Enter Tenant house number: ");
        int houseNumber = scanner.nextInt();

        System.out.print("Enter Tenant phone: ");
        int phone = scanner.nextInt();

        System.out.print("Has the Tenant paid? (true/false): ");
        boolean paymentStatus = scanner.nextBoolean();

        // Crear el objeto Tenant
        Tenant tenant = new Tenant(tenantId, tenantName, houseNumber, phone, paymentStatus);

        System.out.println("Tenant -> " + tenant);

        // Guardar datos de Tenant en CSV y JSON
        String tenantData = tenantId + "," + tenantName + "," + houseNumber + "," + phone + "," + paymentStatus;
        FileManager.save(tenantData, "tenant", "csv");
        FileManager.save(tenantData, "tenant", "json");

        // Finalizar
        scanner.close();
        System.out.println("Data successfully saved!");
    }
}
