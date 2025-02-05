package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Andrés Espinosa
 */
public class Lion implements Mammal{

    @Override
    public void drawTeeths() {
        System.out.println("I am draw tje Teetj of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("I am feedinga a Lion");
    }

    @Override
    public void born() {
        System.out.println("A lion is born");
    }

}
