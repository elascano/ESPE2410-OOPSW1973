

package ec.edu.espe.abstractfactoryexample.controller;

import ec.edu.espe.abstractfactoryexample.model.Button;
import ec.edu.espe.abstractfactoryexample.model.GUIFactory;
import ec.edu.espe.abstractfactoryexample.model.Menu;

/**
 *
 * @author Robinson Bonilla
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
