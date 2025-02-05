
package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Brandon Pazmino
 */
public class C extends A {
    private ArrayList<E> es;

    public C(ArrayList<A> as) {
        super(as);
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
}
