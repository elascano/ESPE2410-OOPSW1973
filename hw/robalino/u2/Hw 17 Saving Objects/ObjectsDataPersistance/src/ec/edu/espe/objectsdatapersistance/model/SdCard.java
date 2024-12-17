

package ec.edu.espe.objectsdatapersistance.model;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
import java.io.Serializable;

public class SdCard implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String brand;
    private int storage; 
    private double price; 

    public SdCard(int id, String brand, int storage, double price) {
        this.id = id;
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Brand: %s | Storage: %dGB | Price: $%.2f",
            id, brand, storage, price
        );
    }
}

