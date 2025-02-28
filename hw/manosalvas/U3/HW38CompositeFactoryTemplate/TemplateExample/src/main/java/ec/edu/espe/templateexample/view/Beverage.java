
package ec.edu.espe.templateexample.view;

import ec.edu.espe.templateexample.model.Coffe;
import ec.edu.espe.templateexample.model.Tea;

/**
 *
 * @author Alexander Maza
 */
public class Beverage {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        
        System.out.println("\n Tea..");
        tea.prepareRecipe();
        
        System.out.println("\n Coffe..");
        coffe.prepareRecipe();
    }
}
