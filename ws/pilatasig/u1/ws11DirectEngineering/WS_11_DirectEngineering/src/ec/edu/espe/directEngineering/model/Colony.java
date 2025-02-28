
package ec.edu.espe.directEngineering.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class Colony {
    ArrayList<Ant> ants;
    public void run(){
        System.out.println("Colony is running");
    }

    public Colony(ArrayList<Ant> ants) {
    }
}
