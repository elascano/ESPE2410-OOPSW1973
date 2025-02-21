package ec.edu.espe.hw38abstractfactorypattern.view;

import ec.edu.espe.hw38abstractfactorypattern.model.Button;
import ec.edu.espe.hw38abstractfactorypattern.controller.GUIFactory;

/**
 *
 * @author Brandon Pazmino
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
