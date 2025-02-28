package ec.edu.espe.template.controller;

import ec.edu.espe.template.model.Coffee;
import ec.edu.espe.template.model.Tea;
import ec.edu.espe.template.view.BeverageView;

/**
 *
 * @author Klever Jami
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
