package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Dennis Paucar
 */
public class Lion implements Mammal{

    @Override
    public void drawTeeth() {
        System.out.println( "I am drawing the TEETH of a "+ this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println(" I am feeding a Lion");
    }

    @Override
    public void born() {
        System.out.println("A lion is born");
    }
    
    
}
