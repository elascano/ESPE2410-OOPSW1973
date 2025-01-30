package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Dennis Paucar
 */
public class Condor  implements Bird {
    
    private float size;

    public Condor(float size) {
        this.size = size;
    }
    
      
    @Override
    public void drawBeak() {
        System.out.println("beak of a Condor");
    }

    @Override
    public void drawFeathers() {
        System.out.println("feathers of a Condor");
    }

    @Override
    public void drawClaws() {
        System.out.println("claws of a condor");
    }

    @Override
    public void feed() {
        System.out.println("feed a Condor");
    }

    @Override
    public void born() {
        System.out.println("a Condor is born");
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
    
}
