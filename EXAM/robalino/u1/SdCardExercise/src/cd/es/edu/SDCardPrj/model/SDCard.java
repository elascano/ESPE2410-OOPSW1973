

package cd.es.edu.SDCardPrj.model;

/**
 *
 * @author abrobalino
 */
public class SDCard {
    private int id;
    private String brand;
    private int storage;
    private int price;

    public SDCard(int id, String brand, int storage, int price) {
        this.id = id;
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SDCard{" + "id=" + id +
                ", brand=" + brand +
                ", storage=" + storage +
                ", price=" + price + '}';
        
        
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
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
