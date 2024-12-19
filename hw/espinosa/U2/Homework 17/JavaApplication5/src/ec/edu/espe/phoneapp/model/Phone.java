package ec.edu.espe.phoneapp.model;

/**
 *
 * @author Andrés Espinosa
 */
import java.io.*;

// Phone class
public class Phone implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String model;
    private String brand;
    private float price;

    // Constructor
    public Phone(int id, String model, String brand, float price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

