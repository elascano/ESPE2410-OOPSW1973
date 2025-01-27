package ec.edu.espe.truck.model;

import java.io.Serializable;

/**
 *
 * @author Andres Sandoval
 */
public class Truck implements Serializable {
    
    private String truckId;
    private int wheels;
    private int seats;
    private String brand;
    private String family;

    public Truck(String truckId, int wheels, int seats, String brand, String family) {
        this.truckId = truckId;
        this.wheels = wheels;
        this.seats = seats;
        this.brand = brand;
        this.family = family;
    }

    public void showInfo() {
        System.out.println("Truck " + truckId + ":");
        System.out.println("  Brand: " + brand);
        System.out.println("  Family: " + family);
        System.out.println("  Wheels: " + wheels);
        System.out.println("  Seats: " + seats);
    }

    public void updateSeats(int newSeats) {
        this.seats = newSeats;
        System.out.println("The number of seats for truck " + truckId + " has been updated to " + seats + ".");
    }


}

    

