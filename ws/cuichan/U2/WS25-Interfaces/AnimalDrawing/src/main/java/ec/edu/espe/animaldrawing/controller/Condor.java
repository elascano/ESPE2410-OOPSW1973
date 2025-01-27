package ec.edu.espe.animaldrawing.controller;

/**
 *
 * @author David Cuichan
 */
public class Condor implements Bird{
    private float size;

    public Condor(float size) {
        this.size = size;
    }
    
    @Override
    public void drawBeak() {
        System.out.println("Drawing the beak of the condor");
    }

    @Override
    public void drawFeathers() {
        System.out.println("Drawing the condor feathers");
    }

    @Override
    public void drawClaws() {
        System.out.println("Drawing the claws of the condor");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the condor");
    }

    @Override
    public void born() {
        System.out.println("The condor is born");
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
