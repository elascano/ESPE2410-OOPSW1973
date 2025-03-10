package ec.edu.espe.terrain.model;

public class Terrain {
    private int id;
    private int squareMeters;
    private float totalPrice;

    public Terrain(int id, int squareMeters) {
        this.id = id;
        this.squareMeters = squareMeters;
        this.totalPrice = squareMeters * SquareMeterPrice.getInstance().getPricePerSquareMeter();
    }

    public int getId() {
        return id;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Terrain{id=" + id + ", squareMeters=" + squareMeters + ", totalPrice=" + totalPrice + '}';
    }
}
