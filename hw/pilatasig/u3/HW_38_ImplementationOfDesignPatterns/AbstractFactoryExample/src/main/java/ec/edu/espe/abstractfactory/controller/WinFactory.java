package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.Menu;
import ec.edu.espe.abstractfactory.model.WinMenu;

/**
 *
 * @author David Pilatasig
 */
public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return (new WinButton());
    }

    @Override
    public Menu createMenu() {
        return (new WinMenu());
    }
    
}
