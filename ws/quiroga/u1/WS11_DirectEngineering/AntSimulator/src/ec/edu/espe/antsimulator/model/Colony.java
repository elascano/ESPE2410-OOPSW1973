
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Esteban Quiroga 
 */
public class Colony {
    ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
     public void run(){
         System.out.println("Esteban's AntSimulator is running!.");
     }
     
     
}
