
package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.model.Coffe;
import ec.edu.espe.templatemethod.model.Tea;

/**
 *
 * @author Marlon Pasquel
 */
public class BeverageTest {
public static void main(String[] args) {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        
        System.out.println("\n Tea..");
        tea.prepareRecipe();
        
        System.out.println("\n Coffe..");
        coffe.prepareRecipe();
    }
}
