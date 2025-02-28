
package ec.edu.espe.terrain.model;

/**
 *
 * @author LABS-DCCO
 */
public class Terrain {
    private int id;              
    private int squareMeters;    
    private float totalPrice;   
    
    public Terrain(int id, int squareMeters, float totalPrice) {
        this.id = id;
        this.squareMeters = squareMeters;
        this.totalPrice = totalPrice;  
    }

    public Terrain(int id, int squareMeters) {
        this.id = id;
        this.squareMeters = squareMeters;
        this.totalPrice = 0;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Terrain{id=" + id + ", squareMeters=" + squareMeters + ", totalPrice=" + totalPrice + '}';
    }
}
