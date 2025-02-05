package ec.edu.espe.animaldrawing.controller;

/**
 *
 * @author David Cuichan
 */
public class Lion implements Mammal{

    @Override
    public void drawTeeth() {
        System.out.println("Drawing teeth of the Lion");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Lion");
    }

    @Override
    public void born() {
        System.out.println("The lion has been born");
    }

}
