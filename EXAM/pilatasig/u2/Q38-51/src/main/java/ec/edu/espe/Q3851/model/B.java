
package ec.edu.espe.Q3851.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class B extends A{
    private ArrayList hs;

    public B(ArrayList hs, ArrayList<A> as) {
        super(as);
        this.hs = hs;
    }

    public ArrayList getHs() {
        return hs;
    }

    public void setHs(ArrayList hs) {
        this.hs = hs;
    }

    
    
}
