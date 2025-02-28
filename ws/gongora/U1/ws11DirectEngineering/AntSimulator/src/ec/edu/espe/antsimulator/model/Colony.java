package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class Colony {
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
    public void run() {
        System.out.println("Lucas's the colony app is running");
    }
}
