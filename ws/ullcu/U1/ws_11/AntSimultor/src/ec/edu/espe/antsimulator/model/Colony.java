package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Ullco
 */
public class Colony {
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    public void run(){
        System.out.println("-----> Mateo's Colony is Run <------");
    }
}
