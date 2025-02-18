package ec.edu.espe.model;

/**
 *
 * @author Mateo Topon
 */
public class ECTax {
    private static ECTax instance;
    private double taxRate;

    private ECTax() {
        this.taxRate = 0.15; // 15% de impuesto EC
    }

    public static ECTax getInstance() {
        if (instance == null) {
            instance = new ECTax();
        }
        return instance;
    }

    public double calculateTax(double amount) {
        return amount * taxRate;
    }

    public void setTaxRate(double newRate) {
        this.taxRate = newRate;
    }
}
