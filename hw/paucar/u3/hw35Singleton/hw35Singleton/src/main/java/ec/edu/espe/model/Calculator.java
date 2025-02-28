package ec.edu.espe.model;

/**
 *
 * @author Dennis Paucar
 */
public class Calculator {
    public double getTotalWithTax(double amount) {
        USTax tax = USTax.getInstance(); 
        double taxAmount = tax.calculateTax(amount);
        return amount + taxAmount;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double amount = 100;
        double total = calculator.getTotalWithTax(amount);
      
        System.out.println("Total con iva: " + total);
    }
}
