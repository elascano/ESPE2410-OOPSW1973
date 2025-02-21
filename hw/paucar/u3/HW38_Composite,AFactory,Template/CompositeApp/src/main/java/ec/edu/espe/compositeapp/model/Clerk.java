
package ec.edu.espe.compositeapp.model;

/**
 *
 * @author Dennis Paucar
 */
public class Clerk  extends Employee{
    public Clerk(String aName){
        this();
        name = aName;
    }
    
    public void stateName(){
        super.stateName();
    }
    
    public Clerk(){
        title= "Clerk";
    }
    
}
