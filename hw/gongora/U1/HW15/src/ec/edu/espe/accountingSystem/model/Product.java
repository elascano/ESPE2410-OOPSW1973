package ec.edu.espe.accountingSystem.model;

/**
 *
 * @author Lucas Gongora
 * @version 0.1.0
 * @since 2024
 */
public class Product {

    private String reference;
    private String description;
    private Price price;
    private int amount;

    @Override
    public String toString() {
        return "Product{" + "reference=" + reference + ", description=" + description + ", price=" + price + ", amount=" + amount + '}';
    }
    
    

    public Product(String reference, String description, Price price, int amount) {
        this.reference = reference;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }
    
    

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public float calculateTotalPrice(){
        //TODO algorithm
        return 0;
    }
    
}
