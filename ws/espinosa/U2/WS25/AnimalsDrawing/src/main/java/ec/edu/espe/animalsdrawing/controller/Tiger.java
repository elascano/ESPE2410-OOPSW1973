package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Andrés Espinosa
 */
public class Tiger implements Mammal{
    
    @Override
    public void drawTeeths() {
        System.out.println("I am draw the Teeth of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("I am feedinga a tiger with a mouse");
    }

    @Override
    public void born() {
        System.out.println("A tigersis born");
    }
}
