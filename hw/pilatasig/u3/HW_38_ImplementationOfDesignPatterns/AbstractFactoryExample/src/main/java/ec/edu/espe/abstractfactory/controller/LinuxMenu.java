package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author David Pilatasig
 */
public class LinuxMenu extends Menu{

    @Override
    public void paint() {
       System.out.println("I'm a LinuxMenu: " + caption);
    }
    
}
