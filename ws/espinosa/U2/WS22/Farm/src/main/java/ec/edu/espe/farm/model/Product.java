package ec.edu.espe.farm.model;

/**
 *
 * @author Andrés Espinosa
 */
class Product {
    private String descritpion;

    @Override
    public String toString() {
        return "Product{" + "descritpion=" + descritpion + '}';
    }

    
    
    public Product(String descritpion) {
        this.descritpion = descritpion;
    }

    
    
    /**
     * @return the descritpion
     */
    public String getDescritpion() {
        return descritpion;
    }

    /**
     * @param descritpion the descritpion to set
     */
    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }
    
}
