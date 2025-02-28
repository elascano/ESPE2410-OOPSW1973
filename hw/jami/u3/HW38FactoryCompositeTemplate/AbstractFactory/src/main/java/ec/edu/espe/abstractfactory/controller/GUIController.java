package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.GUIFactory;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author Klever Jami
 */
public class GUIController {

    private GUIFactory factory;
    private Button button;
    private Menu menu;

    public GUIController() {
        this.factory = GUIFactory.getFactory();
        this.button = factory.createButton();
        this.menu = factory.createMenu();
    }

    public void renderComponents() {
        button.paint();
        menu.paint();
    }
}
