package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Lucas Gongora
 */
public class Tiger implements Mammal {
    
    

    @Override
    public void drawTeeth() {
        System.out.println("I am a drawing the TEETH of a " + this.getClass().getSimpleName() + " and these are my teeth");
    }

    @Override
    public void feed() {
        System.out.println("I am feeding a tiger");
    }

    @Override
    public void born() {
        System.out.println("A tiger is born");
    }
}
