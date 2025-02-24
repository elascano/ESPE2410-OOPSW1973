

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Wing;

/**
 *
 * @author Lucas Gongora
 */
public class GriffinWing implements Wing{

    @Override
    public boolean hasFeathers() {
        return true;
    }

    @Override
    public void attack() {
        System.out.println(" wing - Flaps its wings to shoot its feathers like arrows");
    }

}
