package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.model.Button;
import ec.edu.espe.Factory.model.Menu;
import ec.edu.espe.Factory.model.WinButton;
import ec.edu.espe.Factory.model.WinMenu;

/**
 *
 * @author Benjamin R
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
