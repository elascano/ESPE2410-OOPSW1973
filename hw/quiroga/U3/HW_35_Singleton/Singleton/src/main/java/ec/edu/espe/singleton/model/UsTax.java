
package ec.edu.espe.singleton.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class UsTax {
    private static UsTax instance;
    private float taxPercentage;

    public UsTax(float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    
    /**
     * @return the instance
     */
    public static UsTax getInstance() {
        if (instance == null){
            instance = new UsTax(0.1F);
        }
        return instance;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(UsTax newInstance) {
        if(newInstance != null){
            instance = newInstance;
        }else{
            throw new IllegalArgumentException("Instance can not be null.");
        }
    }
    
    public float salesTotal(float subtotal){
        float total;
        float tax;
        tax = subtotal * taxPercentage;
        total = subtotal+tax;
        return total;
    }
}
