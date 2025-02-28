package ec.edu.espe.model;

/**
 *
 * @author Gabriel Manosalvas 
 */
public class UsTax {
    private static UsTax instance;
    private double taxRate;

    private UsTax() {
        this.taxRate = 0.15; // 7% de impuesto por defecto
    }

    public static UsTax getInstance() {
        if (instance == null) {
            instance = new UsTax();
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
