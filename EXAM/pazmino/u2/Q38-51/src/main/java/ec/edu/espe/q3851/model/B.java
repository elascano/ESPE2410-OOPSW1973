
package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Brandon Pazmino
 */
public class B extends A {
    ArrayList<H> hs;

    public B(ArrayList<A> as) {
        super(as);
    }

    @Override
    public String toString() {
        return "B{" + "hs=" + hs + '}';
    }
    
    
}
