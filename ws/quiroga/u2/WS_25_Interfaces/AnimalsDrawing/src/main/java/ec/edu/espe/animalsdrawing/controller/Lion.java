
package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Esteban Quiroga 
 */
public class Lion implements Mammal {

    @Override
    public void drawTeeth() {
        System.out.println("I am the teeth od a Lion");
    }

    @Override
    public void feed() {
        System.out.println("Lion is being fed");
    }

    @Override
    public void born() {
        System.out.println("A lion has born");
    }
    

}
