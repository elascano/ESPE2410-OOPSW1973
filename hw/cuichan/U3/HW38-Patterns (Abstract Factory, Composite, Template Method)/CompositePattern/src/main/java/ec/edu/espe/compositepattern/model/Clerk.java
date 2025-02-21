package ec.edu.espe.compositepattern.model;

/**
 *
 * @author David Cuichan
 */
public class Clerk extends Employee{
    public Clerk(String aName) {
        this();
        name = aName;
    }
    
    @Override
    public void stateName() {
        super.stateName();
    }
    
    public Clerk() {
        title = "Clerk";
    }
}
