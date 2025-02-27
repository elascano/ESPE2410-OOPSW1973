package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Lisbeth Tipan
 */
public class Colony {
    
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    public void run(){
        System.out.println("Lisbeth Tipan the colony app is running");
    }

}
