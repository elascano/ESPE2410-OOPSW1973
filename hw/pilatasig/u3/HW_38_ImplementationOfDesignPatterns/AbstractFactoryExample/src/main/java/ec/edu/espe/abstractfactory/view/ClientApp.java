package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.controller.GUIFactory;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author David Pilatasig
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory= GUIFactory.getFactory();
        Button aButton= aFactory.createButton();
        aButton.caption="Play";
        aButton.paint();
        
        Menu aMenu= aFactory.createMenu();
        aMenu.caption="Table of users";
        aMenu.paint();
    }
}
