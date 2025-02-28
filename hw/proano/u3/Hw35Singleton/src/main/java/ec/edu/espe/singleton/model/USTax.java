
package ec.edu.espe.singleton.model;

/**
 *
 * @author abner
 */
public class USTax {
    
    private static USTax instance;

    private double taxRate;

    private USTax() {}

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double salesTotal(double amount) {
        return amount + (amount * (taxRate / 100));
    }

}
