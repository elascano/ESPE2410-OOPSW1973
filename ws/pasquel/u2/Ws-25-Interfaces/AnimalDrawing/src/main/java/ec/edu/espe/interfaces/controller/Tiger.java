
package ec.edu.espe.interfaces.controller;

/**
 *
 * @author marlo
 */
public class Tiger implements Mammal {


    
    
    @Override
    public void drawTheeth() {
        System.out.println("Drawing Theeth");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Tiger");
    }

    @Override
    public void born() {
        System.out.println("New Tiger was born");
    }
}
