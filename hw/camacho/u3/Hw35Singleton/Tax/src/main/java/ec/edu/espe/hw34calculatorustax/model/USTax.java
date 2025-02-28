package ec.edu.espe.hw34calculatorustax.model;

/**
 *
 * @author Mateo
 */
public class USTax {

    private static USTax instance;
    private float taxPercentage;

    public USTax(float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax(0.2F);
        }
        return instance;
    }
    
    public float salesTotal(float subtotal) {
        float total;
        float tax;
        tax = subtotal * getTaxPercentage();
        total = subtotal + tax;
        return total;

    }

    public static void setInstance(USTax newInstance) {
        if (newInstance != null) {
            instance = newInstance;
        } else {
            throw new IllegalArgumentException("Instance can not be null.");
        }
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
