

package ec.edu.espe.farm.model;

/**
 *
 * @author Alan Arias
 */
public class Product {
    private String description;

    @Override
    public String toString() {
        return "Product{" + "description=" + description + '}';
    }

    public Product(String description) {
        this.description = description;
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
}
