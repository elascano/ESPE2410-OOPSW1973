package ec.edu.espe.hw38abstractfactorypattern.controller;

import ec.edu.espe.hw38abstractfactorypattern.model.Button;
import ec.edu.espe.hw38abstractfactorypattern.model.Menu;
import ec.edu.espe.hw38abstractfactorypattern.model.WinButton;
import ec.edu.espe.hw38abstractfactorypattern.model.WinMenu;

/**
 *
 * @author Brandon Pazmino
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
