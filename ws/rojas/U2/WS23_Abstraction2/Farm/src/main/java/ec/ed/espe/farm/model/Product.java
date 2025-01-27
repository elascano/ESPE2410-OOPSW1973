
package ec.ed.espe.farm.model;

/**
 *
 * @author G406
 */
class Product {
    
    private String descrpition;

    public Product(String descrpition) {
        this.descrpition = descrpition;
    }

    @Override
    public String toString() {
        return "Product{" + "descrpition=" + descrpition + '}';
    }


    
    
    

    /**
     * @return the descrpition
     */
    public String getDescrpition() {
        return descrpition;
    }

    /**
     * @param descrpition the descrpition to set
     */
    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }
    
    
}
