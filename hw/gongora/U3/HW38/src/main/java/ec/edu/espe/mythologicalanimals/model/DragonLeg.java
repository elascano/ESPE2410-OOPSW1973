

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Leg;

/**
 *
 * @author Lucas Gongora
 */
public class DragonLeg implements Leg{

    @Override
    public void attack() {
        System.out.println("leg -  tries to scratch his prey");
    }

    @Override
    public boolean hasPads() {
        return false;
    }

}
