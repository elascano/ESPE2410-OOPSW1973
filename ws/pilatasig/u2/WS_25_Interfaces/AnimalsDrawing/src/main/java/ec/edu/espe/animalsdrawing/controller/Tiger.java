package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Usuario
 */
public class Tiger implements Mammal{
        @Override
    public void drawTheet() {
        System.out.println("I am a drawing the THEET of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("I am feeding a Tiger with a mouse");
    }

    @Override
    public void born() {
        System.out.println("A Tiger is born");
    }
}
