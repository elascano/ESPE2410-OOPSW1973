package ec.edu.espe.abstractfactory.model;

import ec.edu.espe.abstractfactory.controller.GUIFactory;

/**
 *
 * @author David Cuichan
 */
public class LinuxFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }

}
