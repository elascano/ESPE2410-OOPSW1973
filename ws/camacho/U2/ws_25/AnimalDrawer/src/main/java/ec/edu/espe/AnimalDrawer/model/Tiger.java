package ec.edu.espe.AnimalDrawer.model;

/**
 *
 * @author mateo
 */
public class Tiger implements Mammal{
    public void drawTeeth (){
        System.out.println("as drawing Teeth of a " + this.getClass().getSimpleName());
    }
    
    public void feed(){
        System.out.println("I am Feeding Tiger");
    }
    
    public void born(){
        System.out.println("Tiger is born");
    }
   
}
