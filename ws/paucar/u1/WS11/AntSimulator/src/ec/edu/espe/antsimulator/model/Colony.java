package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Pasquel
 */
public class Colony {
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
    public void run(){
        System.out.println(" The colony is running ");
    }
    
    
}
