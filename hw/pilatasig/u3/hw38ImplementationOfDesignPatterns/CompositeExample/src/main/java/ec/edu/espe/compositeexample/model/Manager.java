
package ec.edu.espe.compositeexample.model;

/**
 *
 * @author David Pilatasig
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
        System.out.println(name + " is electing by the president as " + title);
        super.stateName();
    }
    
    
    
}
