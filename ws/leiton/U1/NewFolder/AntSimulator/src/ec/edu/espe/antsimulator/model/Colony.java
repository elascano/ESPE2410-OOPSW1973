package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Leiton
 */
public class Colony {
    ArrayList<Ant> ants;//las hormigas son parte de la colonia: asociacion o composicion

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
    public void run(){
        System.out.println(" Leiton's colony app is running");
    }
}
