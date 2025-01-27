
package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Esteban Quiroga 
 */
public class Condor implements Bird{
    float size;

    @Override
    public void drawBeak() {
        System.out.println("beak of condor");
    }

    @Override
    public void drawFeather() {
        System.out.println("feather of condor");
    }

    @Override
    public void drawClaws() {
        System.out.println("claws of condor");
    }

    @Override
    public void feed() {
        System.out.println("Condor is being fed");
    }

    @Override
    public void born() {
        System.out.println("A condor has born");
    }
    
    
}
