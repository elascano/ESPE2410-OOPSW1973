

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Leg;

/**
 *
 * @author Lucas Gongora
 */
public class GriffinLeg implements Leg {

    
    @Override
    public void attack() {
        System.out.println("It's a leg trying to crush it");
    }

    @Override
    public boolean hasPads() {
        
        return true;
    }

}
