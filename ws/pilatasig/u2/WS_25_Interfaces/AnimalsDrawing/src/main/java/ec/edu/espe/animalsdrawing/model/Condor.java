package ec.edu.espe.animalsdrawing.model;

import ec.edu.espe.animalsdrawing.controller.Bird;

/**
 *
 * @author Usuario
 */
public class Condor implements Bird{
    private float size;

    public Condor(float size) {
        this.size = size;
    }
    
    
    @Override
    public void drawBeak() {
        System.out.println("Beak of a Condor");
    }

    @Override
    public void drawFeathers() {
        System.out.println("Feathers of a Condor"); 
    }

    @Override
    public void drawClaws() {
        System.out.println("Claws of a Condor");
    }

    @Override
    public void feed() {
        System.out.println("Feed a Condor with steak");
    }

    @Override
    public void born() {
        System.out.println("A Conder is born");
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
