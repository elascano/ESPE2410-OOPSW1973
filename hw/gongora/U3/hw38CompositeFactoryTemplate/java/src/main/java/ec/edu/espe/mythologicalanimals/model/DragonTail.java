

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Tail;

/**
 *
 * @author Lucas Gongora
 */
public class DragonTail implements Tail{

    @Override
    public void attack() {
        System.out.println("tail - tries to stab his prey");
    }

    @Override
    public boolean hasSharpTip() {
        System.out.println(" have a sharp tail");
        return true;
    }

}
