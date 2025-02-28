

package ec.edu.espe.templateexample.controller;

import ec.edu.espe.templateexample.model.Coffee;
import ec.edu.espe.templateexample.model.Tea;
import ec.edu.espe.templateexample.view.BeverageView;

/**
 *
 * @author Mateo Topon
 */
public class BeverageController {
    private Tea tea;
    private Coffee coffee;
    private BeverageView view;
    
    public BeverageController() {
        tea = new Tea();
        coffee = new Coffee();
        view = new BeverageView();
    }
    public void prepareBeverages() {
        view.displayPreparingTea();
        tea.setWantsLemon(view.askForTeaCondiments());
        tea.prepareRecipe();
        
        System.out.println();
        
        view.displayPreparingCoffee();
        coffee.setWantsCondiments(view.askForCoffeeCondiments());
        coffee.prepareRecipe();
    }
}
