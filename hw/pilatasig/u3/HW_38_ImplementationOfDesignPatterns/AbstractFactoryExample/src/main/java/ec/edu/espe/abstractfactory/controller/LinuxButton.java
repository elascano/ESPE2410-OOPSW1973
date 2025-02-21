package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;

/**
 *
 * @author David Pilatasig
 */
public class LinuxButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
    
}
