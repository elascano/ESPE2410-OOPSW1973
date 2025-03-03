package ec.espe.edu.StoreS.model;

/**
 *
 * @author LABS-DCCO
 */

public class Shoe {
    private String name;
    private int id;
    private float price;
    private int Quantity;

    public Shoe(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public Shoe(String name, float price, int quantity) {
        this.name = name;
        this.price = price;  
        this.Quantity = quantity;
    }
        

    @Override
    public String toString() {
        return "Dish{" + "name=" + name + ", id=" + id + ", price=" + price + '}';
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

}
