package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;

/**
 *
 * @author Dennis Paucar
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
    
}
