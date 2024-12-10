package ec.edu.espe.reverseEngineering.model;

import java.util.ArrayList;

/**
 *
 * @author David Cuichan
 */
public class B {
    private ArrayList<C> cs;
    private D d[];

    @Override
    public String toString() {
        String ds = "";
        for (D d1 : d) {
            ds = ds+", " + d1;
        }
        return "B{" + "cs=" + cs + ", d=" + ds + '}';
    }

    
    
    public B(ArrayList<C> cs, D[] d) {
        this.cs = cs;
        this.d = d;
    }

    
    /**
     * @return the cs
     */
    private ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    private void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    /**
     * @return the d
     */
    private D[] getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    private void setD(D[] d) {
        this.d = d;
    }
    
    
}
