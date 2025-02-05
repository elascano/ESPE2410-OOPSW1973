
package ec.espe.edu.q3851.model;

/**
 * author Alexander Maza
 */


import java.util.ArrayList;

public class B extends A{
    public void r(){
        
    }

    public B(ArrayList<A> as) {
        super(as);
    }
    
    @Override
    public String toString() {
        return " B " + " extends -> " + super.toString();
    }
    
    
}
