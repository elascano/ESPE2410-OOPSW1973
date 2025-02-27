package ec.edu.espe.abstractfactory.model;

import ec.edu.espe.abstractfactory.controller.GUIFactory;

/**
 *
 * @author David Cuichan
 */
public class WinFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }

}
