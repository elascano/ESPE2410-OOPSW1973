package ec.edu.espe.antsimulator.model;

import ec.edu.espe.antsimulator.view.Ants;
import java.util.ArrayList;

/**
 *
 * @author Matias Rojas
 */
public class Colony {

    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    public Colony(ArrayList<Ants> ants) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
    
    public void run(){
            System.out.println("the colony is running");
    }
    
}
