
package ec.edu.espe.compositeapp.model;

/**
 *
 * @author Dennis Paucar
 */
public class Manager extends Supervisor{

    public Manager(String aName){
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title="Manager";
    }
    
    public void stateName(){
        super.stateName();
    }
    
    
    
}
