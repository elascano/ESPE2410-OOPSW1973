
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Klever Jami
 */
public class D extends A{
    E es[ ]= new E[5];
    private ArrayList<F> fs;

    public D(ArrayList<F> fs, ArrayList<A> as) {
        super(as);
        this.fs = fs;
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
