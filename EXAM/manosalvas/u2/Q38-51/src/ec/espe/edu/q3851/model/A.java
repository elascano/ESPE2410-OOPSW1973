
package ec.espe.edu.q3851.model;

import java.util.ArrayList;

/**
 *
 */
public class A {
    ArrayList<A> as;

    @Override
    public String toString() {
        return "A" + " composed by " + as + '}';
    }

    
    
    public A(ArrayList<A> as) {
        this.as = as;
    }
    
    
}
