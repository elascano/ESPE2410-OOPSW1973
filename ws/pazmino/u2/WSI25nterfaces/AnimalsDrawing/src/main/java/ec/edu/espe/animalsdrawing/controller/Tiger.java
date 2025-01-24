package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Brandon Pazminoi
 */
public class Tiger implements Mammal{

    @Override
    public void drawTeeth() {
        System.out.println("Im a drawing of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("im a feeding a tiger with a mouse");

    }

    @Override
    public void born() {
        System.out.println("a tiger is born");

    }

}
