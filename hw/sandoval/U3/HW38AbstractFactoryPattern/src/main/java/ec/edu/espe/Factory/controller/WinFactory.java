package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.model.*;

/**
 *
 * @author Andrés Sandoval
 */
public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return(new WinButton());
    }

    @Override
    public Menu createMenu() {
        return(new WinMenu());
    }
}
