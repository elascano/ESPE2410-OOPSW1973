

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Head;

/**
 *
 * @author Lucas Gongora
 */
public class DragonHead implements Head{

    @Override
    public void attack() {
        System.out.println("the head - breathe fire");
    }

    @Override
    public boolean hasHorns() {
        return true;
    }

}
