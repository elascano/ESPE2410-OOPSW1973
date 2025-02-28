package ec.edu.espe.Factory.view;

import ec.edu.espe.Factory.model.Button;
import ec.edu.espe.Factory.controller.GUIFactory;

/**
 *
 * @author Andrés Sandoval
 */
public class AppButton {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
