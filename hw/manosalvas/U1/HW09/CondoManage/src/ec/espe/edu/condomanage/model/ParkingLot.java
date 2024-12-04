package ec.espe.edu.condomanage.model;

public class ParkingLot {
    private int spaceNumber;
    private boolean isOccupied;

    public ParkingLot(int spaceNumber, boolean isOccupied) {
        this.spaceNumber = spaceNumber;
        this.isOccupied = isOccupied;
    }

    // Getters y Setters
    public int getSpaceNumber() {
        return spaceNumber;
    }

    public void setSpaceNumber(int spaceNumber) {
        this.spaceNumber = spaceNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "spaceNumber=" + spaceNumber +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
