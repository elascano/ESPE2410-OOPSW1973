package ec.espe.edu.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Maza
 */
public class Colony {
    ArrayList<Ant> ants;
    
    public void run() {
        System.out.println("Alexander colony app is running");
        
    }

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
}

