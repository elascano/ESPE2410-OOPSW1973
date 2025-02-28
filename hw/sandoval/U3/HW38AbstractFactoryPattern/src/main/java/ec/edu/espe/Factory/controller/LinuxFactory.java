package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.model.*;

/**
 *
 * @author Andrés Sandoval
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
