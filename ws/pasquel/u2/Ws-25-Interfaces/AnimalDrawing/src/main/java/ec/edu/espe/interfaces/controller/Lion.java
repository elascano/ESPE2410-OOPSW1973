
package ec.edu.espe.interfaces.controller;

/**
 *
 * @author marlo
 */
public class Lion implements Mammal{

    @Override
    public void drawTheeth() {
        System.out.println("Drawing Theeth");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Lion");
    }

    @Override
    public void born() {
        System.out.println("New lion was born");
    }

    

}
