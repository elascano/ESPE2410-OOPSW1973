package ec.edu.espe.model;

/**
 *
 * @author David Pilatasig
 */
public class USTax {
    private static USTax instance;
    private double taxRate = 0.15;

    private USTax() {
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    
    public double calculateTax(double saleAmount) {
        return saleAmount * taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}



