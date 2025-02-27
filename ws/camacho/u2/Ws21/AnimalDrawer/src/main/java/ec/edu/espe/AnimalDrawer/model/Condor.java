package ec.edu.espe.AnimalDrawer.model;

/**
 *
 * @author mateo
 */
public class Condor implements Bird {
    private float size;
    
     public void drawTeeth(){
        System.out.println("I as a " + this.getClass().getSimpleName());
    }
    
    public void feed(){
        System.out.println("I am Feeding Condor");
    }
    
    public void born(){
        System.out.println("Lion is Condor");
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

    public Condor(float size) {
        this.size = size;
    }    

}
