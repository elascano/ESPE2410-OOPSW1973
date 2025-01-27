package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Andrés Espinosa
 */
public class Condor implements Bird{
    
    private float size;

    public Condor(float size) {
        this.size = size;
    }
    

    @Override
    public void drawPeak() {
        System.out.println("beak of a condor");
    }

    @Override
    public void drawFeather() {
        System.out.println("feathers of a condor");
    }

    @Override
    public void drawClaw() {
        System.out.println("clawws of a condor");
    }

    @Override
    public void feed() {
        System.out.println("feed a condor");
    }

    @Override
    public void born() {
        System.out.println("A condor is born");
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }
    
    

}
