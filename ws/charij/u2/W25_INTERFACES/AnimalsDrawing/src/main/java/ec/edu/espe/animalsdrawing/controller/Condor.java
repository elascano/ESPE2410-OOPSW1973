

package ec.edu.espe.animalsdrawing.controller;

/**
 *
 * @author Sebastian Charij
 */
public class Condor implements Bird {
    
    
    private float size;

    public Condor(float size) {
        this.size = size;
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

    @Override
    public void drawBeak() {
        System.out.println("beak of a Condor");
    }

    @Override
    public void drawFeather() {
        System.out.println("feathers of a Condor");
    }

    @Override
    public void drawClaws() {
        System.out.println("claws of a Condor");
    }

    @Override
    public void feed() {
        System.out.println("feed a Condor");
    }

    @Override
    public void born() {
        System.out.println("a Condor is born");
    }
    
}
