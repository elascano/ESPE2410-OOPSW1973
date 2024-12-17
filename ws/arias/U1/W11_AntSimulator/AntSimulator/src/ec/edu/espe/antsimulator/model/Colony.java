package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Alan Arias
 */
public class Colony {
    
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
    public void run(){
        System.out.println("Alan's colony app is running");
    }
}
