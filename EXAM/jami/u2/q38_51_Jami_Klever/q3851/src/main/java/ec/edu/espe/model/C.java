
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Klever Jami
 */
public class C extends A {
       private ArrayList<E> es;

    public C(ArrayList<E> es, ArrayList<A> as) {
        super(as);
        this.es = es;
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
