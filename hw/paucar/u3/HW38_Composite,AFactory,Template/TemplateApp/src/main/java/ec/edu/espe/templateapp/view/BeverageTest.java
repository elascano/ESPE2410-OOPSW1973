package ec.edu.espe.templateapp.view;

import ec.edu.espe.templateapp.model.Coffee;
import ec.edu.espe.templateapp.model.Tea;

/**
 *
 * @author Dennis Paucar
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee....");
        coffee.prepareRecipe();
    }
}
