
package ec.edu.espe.Q3851.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class C extends A{
    private ArrayList<E> es;

    public C(ArrayList<E> es, ArrayList<A> as) {
        super(as);
        this.es = es;
    }

    public ArrayList<E> getEs() {
        return es;
    }

    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
}
