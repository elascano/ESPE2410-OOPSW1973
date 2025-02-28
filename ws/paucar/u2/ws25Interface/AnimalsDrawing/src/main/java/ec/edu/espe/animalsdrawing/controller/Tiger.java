package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Dennis Paucar
 */
public class Tiger implements Mammal{

    public Tiger() {
    }
    
    

    @Override
    public void drawTeeth() {
        System.out.println( "I am drawing the TEETH of a "+ this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println(" I am feeding a Tiger with a mouse");
    }

    @Override
    public void born() {
        System.out.println("A tiger is born");
    }
    
    
}
