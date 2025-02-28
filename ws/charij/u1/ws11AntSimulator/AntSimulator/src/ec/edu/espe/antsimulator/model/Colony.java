package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Charij
 */
public class Colony {
    
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
    public void run(){
        System.out.println("Sebastian's colony app is running");
    }
}
