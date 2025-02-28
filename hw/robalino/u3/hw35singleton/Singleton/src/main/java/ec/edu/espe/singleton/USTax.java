

package ec.edu.espe.singleton;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
class USTax {
    private static USTax instance;
    
    // Private constructor to prevent instantiation
    private USTax() {
    }
    
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }
    
    public float salesTotal(float amount, float taxRate) {
        // Calculate total including tax
        float taxAmount = amount * taxRate;
        float total = amount + taxAmount;
        return total;
    }
}
