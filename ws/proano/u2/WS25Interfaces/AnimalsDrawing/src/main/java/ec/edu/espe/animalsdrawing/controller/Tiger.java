

package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Alan Arias
 */
public class Tiger implements Mammal {
    
    @Override
    public void drawTeeth() {
        System.out.println("I am drawing the TEETH of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("I am feeding a tiger with a mouse");
    }

    @Override
    public void born() {
        System.out.println("A tiger is born"); 
    }

}
