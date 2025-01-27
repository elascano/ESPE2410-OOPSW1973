package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Brandon Pazmino
 */
public class Lion implements Mammal{

    @Override
    public void drawTeeth() {
        System.out.println("Im a drawing of a " + this.getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.println("im a feeding a lion");
        
    }

    @Override
    public void born() {
        System.out.println("a lion is born");
     
    }


}
