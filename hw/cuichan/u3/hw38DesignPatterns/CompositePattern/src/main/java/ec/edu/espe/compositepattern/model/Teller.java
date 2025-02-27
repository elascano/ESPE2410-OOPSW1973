package ec.edu.espe.compositepattern.model;

/**
 *
 * @author David Cuichan
 */
public class Teller extends Employee{
    public Teller(String aName) {
        this();
        name = aName;
    }
    
    @Override
    public void stateName() {
        super.stateName();
    }
    
    public Teller() {
        title = "Teller";
    }
}
