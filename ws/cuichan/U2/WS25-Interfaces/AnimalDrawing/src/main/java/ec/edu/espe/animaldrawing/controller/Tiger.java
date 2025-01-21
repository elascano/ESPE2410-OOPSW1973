package ec.edu.espe.animaldrawing.controller;

/**
 *
 * @author David Cuichan
 */
public class Tiger implements Mammal{

    @Override
    public void drawTeeth() {
        System.out.println("Drawing teeth of the Tiger");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the tiger");
    }

    @Override
    public void born() {
        System.out.println("The tiger has been born");
    }

}
