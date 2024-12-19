
/**
 *
 * @author USUARIO
 */
import java.io.Serializable;

public class SoccerBall implements Serializable {
    private int id;
    private String brand;
    private double price;
    private String Material;

    public SoccerBall(int id, String brand, double price, String Material) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.Material = Material;
    }

    @Override
    public String toString() {
        return "SoccerBall{" + "id=" + id + ", brand=" + brand + ", price=" + price + ", Material=" + Material + '}';
    }


   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the Material
     */
    public String getMaterial() {
        return Material;
    }

    /**
     * @param Material the Material to set
     */
    public void setMaterial(String Material) {
        this.Material = Material;
    }
}
