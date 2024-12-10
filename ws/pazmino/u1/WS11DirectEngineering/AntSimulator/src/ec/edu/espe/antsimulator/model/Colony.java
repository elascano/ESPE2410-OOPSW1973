package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Brandon Pazmino 
 */
public class Colony {
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
    public void run(){
        System.out.println("Brandon's colony app is running");
    }
}
