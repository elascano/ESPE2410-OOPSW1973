
package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Brandon PAzmino
 */
public class D extends A{
    private ArrayList<F> fs;
    E es[] = new E[5];

    public D(ArrayList<A> as) {
        super(as);
    }

    
    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }
    
}
