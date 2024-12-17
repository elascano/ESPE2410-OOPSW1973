package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Sandoval
 */
public class Colony {
    
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    public void run(){
        System.out.println("Andres the colony app is running");
    }

}
