package ec.edu.espe.ustaxcalculator.model;

/**
 *
 * @author David Cuichan
 */
public class USTax {
    private static USTax instance;
    private float taxRate = 0.15f;

    private USTax(){
        
    }

    public static USTax getInstance() { 
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float salesTotal(float saleAmount) {  
        return saleAmount + (saleAmount * taxRate);
    }
}
