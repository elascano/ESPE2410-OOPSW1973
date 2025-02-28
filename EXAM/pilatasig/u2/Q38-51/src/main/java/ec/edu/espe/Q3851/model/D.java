
package ec.edu.espe.Q3851.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class D extends A{
    private ArrayList<F> fs;
    private E es[]= new E[5];

    public D(ArrayList<F> fs, E[] es, ArrayList<A> as) {
        super(as);
        this.fs = fs;
        this.es = es;
    }

    public ArrayList<F> getFs() {
        return fs;
    }

    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    public E[] getEs() {
        return es;
    }

    public void setEs(E[] es) {
        this.es = es;
    }

    

    
}
