package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.controller.GUIFactory;

/**
 *
 * @author Dennis Paucar
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory= GUIFactory.getFactory();
        Button aButton= aFactory.createButton();
        aButton.caption="Play";
        aButton.paint();
        aButton.caption="Exit";
        aButton.paint();
    }
}
