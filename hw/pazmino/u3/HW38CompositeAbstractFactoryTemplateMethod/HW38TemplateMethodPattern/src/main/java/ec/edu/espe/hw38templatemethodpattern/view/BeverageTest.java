package ec.edu.espe.hw38templatemethodpattern.view;

import ec.edu.espe.hw38templatemethodpattern.model.Coffe;
import ec.edu.espe.hw38templatemethodpattern.model.Tea;

/**
 *
 * @author Brandon Pazmino
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
