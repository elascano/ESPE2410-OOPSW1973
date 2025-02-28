package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Klever Jami
 */
public class B extends A {
    private ArrayList<H> hs;

    public B(ArrayList<H> hs, ArrayList<A> as) {
        super(as);
        this.hs = hs;
    }

    
    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
    
}
