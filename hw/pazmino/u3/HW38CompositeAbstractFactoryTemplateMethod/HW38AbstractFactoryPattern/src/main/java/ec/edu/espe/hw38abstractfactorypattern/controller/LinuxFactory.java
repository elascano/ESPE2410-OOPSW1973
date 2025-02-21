package ec.edu.espe.hw38abstractfactorypattern.controller;

import ec.edu.espe.hw38abstractfactorypattern.model.Button;
import ec.edu.espe.hw38abstractfactorypattern.model.LinuxButton;
import ec.edu.espe.hw38abstractfactorypattern.model.LinuxMenu;
import ec.edu.espe.hw38abstractfactorypattern.model.Menu;



/**
 *
 * @author Brandon Pazmino
 */
public class LinuxFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return(new LinuxButton());
    }

    @Override
    public Menu createMenu() {
        return(new LinuxMenu());
    }
    
    
}
