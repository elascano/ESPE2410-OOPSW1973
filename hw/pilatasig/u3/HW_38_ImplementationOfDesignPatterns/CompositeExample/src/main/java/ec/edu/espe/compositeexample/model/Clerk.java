
package ec.edu.espe.compositeexample.model;

/**
 *
 * @author David Pilatasig
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
