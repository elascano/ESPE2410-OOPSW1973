

package ec.edu.espe.mythologicalanimals.model;


import ec.edu.espe.mythologicalanimals.controller.Wing;

/**
 *
 * @author Lucas Gongora
 */
public class DragonWing implements Wing {

    @Override
    public boolean hasFeathers() {
        return false;
    }

    @Override
    public void attack() {
        System.out.println("Wing - Flaps to Sweep Around");
    }

    
    

}
