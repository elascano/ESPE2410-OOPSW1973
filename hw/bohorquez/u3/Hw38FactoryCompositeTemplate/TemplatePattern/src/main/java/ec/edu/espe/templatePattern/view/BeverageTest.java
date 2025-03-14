package ec.edu.espe.templatePattern.view;


import ec.edu.espe.templatePattern.model.Coffee;
import ec.edu.espe.templatePattern.model.Tea;
import ec.edu.espe.templatePattern.model.CaffeineBeverage;

/**
 *
 * @author Camila Bohorquez
 */

public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}