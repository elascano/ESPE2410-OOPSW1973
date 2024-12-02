package ec.edu.espe.reverseengineering.model;

import java.util.ArrayList;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class B {

    private ArrayList<C> cs;
    private D d[];

    public B(ArrayList<C> cs, D[] d) {
        this.cs = cs;
        this.d = d;
    }

    @Override
    public String toString() {
        String ds=" ";
        for (D d1 : d) {
            ds = ds + ", " + d1;
        }
        return "B{" + "cs=" + cs + ", d=" + ds + '}';
    }

    /**
     * @return the CS
     */
    public ArrayList<C> getcs() {
        return cs;
    }

    /**
     * @param cs the CS to set
     */
    public void setcs(ArrayList<C> cs) {
        this.cs = cs;
    }

    /**
     * @return the d
     */
    public D[] getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D[] d) {
        this.d = d;
    }
}
