

package ec.edu.espe.singleton;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Calculator{
  public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        float total = tax.salesTotal(100.0f, 0.06f); // Example values: amount $100, tax rate 6%
        System.out.println("Total including tax: $" + total);
    }
    
}
