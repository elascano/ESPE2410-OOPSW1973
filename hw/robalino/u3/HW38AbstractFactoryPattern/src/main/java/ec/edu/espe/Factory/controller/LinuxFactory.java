package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.model.Button;
import ec.edu.espe.Factory.model.LinuxButton;
import ec.edu.espe.Factory.model.LinuxMenu;
import ec.edu.espe.Factory.model.Menu;



/**
 *
 * @author Benjamin R
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
