package ec.edu.espe.templateexample.view;

import ec.edu.espe.templateexample.controller.Coffee;
import ec.edu.espe.templateexample.controller.Tea;

/**
 *
 * @author David Pilatasig
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea= new Tea();
        Coffee coffee= new Coffee();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking Coffe");
       coffee.prepareRecipe();
    }
}
