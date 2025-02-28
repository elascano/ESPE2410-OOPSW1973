
package ec.edu.espe.interfaces.controller;

/**
 *
 * @author marlo
 */
public class Condor implements Bird {

    private float size;

    public Condor(float size) {
        this.size = size;
    }
    
    @Override
    public void drawBeak() {
       
    }

    @Override
    public void drawFeathers() {
        
    }

    @Override
    public void drawClaws() {
       
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
    public void feed() {
    }

    @Override
    public void born() {
    }

}
