package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Usuario
 */
public class Lion implements Mammal{

    @Override
    public void drawTheet() {
        System.out.println("I am a srawing the TEEthe of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("I am feeding a Lion with a steak");
    }

    @Override
    public void born() {
        System.out.println("A Lion is born");
    }
}
