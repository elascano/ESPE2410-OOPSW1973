package ec.edu.espe.model;

/**
 *
 * @author Klever Jami
 */
public class TaxRateCalculator {

    private static TaxRateCalculator instance;
    private double taxRate;

    private TaxRateCalculator() {
        this.taxRate = 0.15; // 7% de impuesto por defecto
    }

    public static TaxRateCalculator getInstance() {
        if (instance == null) {
            instance = new TaxRateCalculator();
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
