package ec.edu.espe.terrain.model;

public class SquareMeterPrice {
    private static final SquareMeterPrice INSTANCE = new SquareMeterPrice();
    private int pricePerSquareMeter;

    private SquareMeterPrice() {
        this.pricePerSquareMeter = 50; 
    }

    public static SquareMeterPrice getInstance() {
        return INSTANCE;
    }

    public int getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(int pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
}
