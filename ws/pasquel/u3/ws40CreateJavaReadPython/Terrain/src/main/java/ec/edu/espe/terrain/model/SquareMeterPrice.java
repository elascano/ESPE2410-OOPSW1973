
package ec.edu.espe.terrain.model;

/**
 *
 * @author LABS-DCCO
 */
    public class SquareMeterPrice {
    private static SquareMeterPrice instance;
    private int pricePerSquareMeter;

    private SquareMeterPrice() {
        this.pricePerSquareMeter = 50; 
    }

    public static SquareMeterPrice getInstance() {
        if (instance == null) {
            instance = new SquareMeterPrice();
        }
        return instance;
    }

    public int getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(int pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
}

