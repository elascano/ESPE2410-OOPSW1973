package ec.edu.espe.client.view;

import ec.edu.espe.client.model.Coffee;
import ec.edu.espe.client.model.Tea;

/**
 *
 * @author mateo
 */
public class Client {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking Tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking Coffee...");
        coffee.prepareRecipe();
    }   
}
