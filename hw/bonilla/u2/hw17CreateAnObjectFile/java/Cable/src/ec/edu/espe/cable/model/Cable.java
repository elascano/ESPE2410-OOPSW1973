package ec.edu.espe.cable.model;

import java.io.Serializable;

/**
 *
 * @author Robinson Bonilla
 */
public class Cable implements Serializable{

    private String id;
    private String type;
    private int numberOfConductors;
    private float price;

    @Override
    public String toString() {
        return "Cable{" + "id=" + id + ", type=" + type + ", numberOfConductors=" + numberOfConductors + ", price=" + price + '}';
    }

    public Cable(String id, String type, int numberOfConductors, float price) {
        this.id = id;
        this.type = type;
        this.numberOfConductors = numberOfConductors;
        this.price = price;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the numberOfConductors
     */
    public int getNumberOfConductors() {
        return numberOfConductors;
    }

    /**
     * @param numberOfConductors the numberOfConductors to set
     */
    public void setNumberOfConductors(int numberOfConductors) {
        this.numberOfConductors = numberOfConductors;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
}
