package ec.edu.espe.singleton.model;

/**
 *
 * @author Lucas Gongora
 */
public class USTax {

    private static USTax instance;
    
    private USTax() {
    }

    public static USTax getInstance() {
        
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float salesTotal(float amount, float taxRate) {
       
        float taxAmount = amount * taxRate;
        float total = amount + taxAmount;
        return total;
    }
}
