package ec.edu.espe.abstractfactory.view;
import ec.edu.espe.abstractfactory.model.*;
/**
 *
 * @author Alexander Maza
 */
public class ClientApp {

    public static void main(String[] args) {
         GUIFactory factory = GUIFactory.getFactory();

        Button button = factory.createButton("Click Me");
        Menu menu = factory.createMenu("Main Menu");

        button.paint();
        menu.paint();
    }
}

