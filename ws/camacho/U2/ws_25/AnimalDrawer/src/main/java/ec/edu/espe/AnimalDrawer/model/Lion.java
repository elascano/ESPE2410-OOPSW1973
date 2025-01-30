package ec.edu.espe.AnimalDrawer.model;

/**
 *
 * @author mateo
 */
public class Lion implements Mammal{
    public void drawTeeth(){
        System.out.println("I as a " + this.getClass().getSimpleName());
    }
    
    public void feed(){
        System.out.println("I am Feeding Lion");
    }
    
    public void born(){
        System.out.println("Lion is born");
    }
}
