package ec.edu.espe.Factory.view;

import ec.edu.espe.Factory.model.Button;
import ec.edu.espe.Factory.controller.GUIFactory;

/**
 *
 * @author Benjamin R
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
