
package ec.edu.espe.abstractfactoryexample.view;

import ec.edu.espe.abstractfactoryexample.model.Button;
import ec.edu.espe.abstractfactoryexample.model.GUIFactory;
import ec.edu.espe.abstractfactoryexample.model.Menu;

/**
 *
 * @author Esteban Quiroga 
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        Menu aMenu = aFactory.createMenu();
        
        aButton.caption = "Play";
        aButton.paint();
        aMenu.caption ="MainMenu";
        aMenu.paint();
    }
}
