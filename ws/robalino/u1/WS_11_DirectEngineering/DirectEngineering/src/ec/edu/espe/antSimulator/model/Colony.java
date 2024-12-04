

package ec.edu.espe.antSimulator.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */

public class Colony {
    ArrayList <Ant> ants;

    @Override
    public String toString() {
        return "Colony{" + "ants=" + ants + '}';
    }

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }

   
    public void run(){
        System.out.println(" Benjamin's  colony app is running");
    }
}
