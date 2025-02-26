

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Tail;

/**
 *
 * @author Lucas Gongora
 */
public class GriffinTail  implements Tail{

    @Override
    public void attack() {
        System.out.println("Wags its tail to clean its surroundings");
    }

    @Override
    public boolean hasSharpTip() {
        return false;
    }

}
