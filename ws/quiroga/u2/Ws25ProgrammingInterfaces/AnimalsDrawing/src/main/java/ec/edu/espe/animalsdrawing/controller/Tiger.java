
package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Esteban Quiroga 
 */
public class Tiger implements Mammal {

    @Override
    public void drawTeeth() {
        System.out.println("Tiger teeth");
    }

    @Override
    public void feed() {
        System.out.println("Tiger is being fed");
    }

    @Override
    public void born() {
        System.out.println("A tiger has born");
    }

}
