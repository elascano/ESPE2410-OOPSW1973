

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Head;

/**
 *
 * @author Lucas Gongora
 */
public class GriffinHead  implements Head{

    @Override
    public void attack() {
        System.out.println("The head try to eat the intruder");
    }

    @Override
    public boolean hasHorns() {
        System.out.println("It's a dog that doesn't have horns");
        return false;
    }

}
