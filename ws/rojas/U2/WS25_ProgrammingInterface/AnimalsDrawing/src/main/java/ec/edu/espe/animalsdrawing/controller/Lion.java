
package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Matias Rojas
 */
public class Lion implements Mammal{

    @Override
    public void drawTeeth() {
        System.out.println("I am drawing the teeth of a lion  " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("I am feeding a lion ");
    }

    @Override
    public void born() {
        System.out.println("Alion is born");
    }
  
}
