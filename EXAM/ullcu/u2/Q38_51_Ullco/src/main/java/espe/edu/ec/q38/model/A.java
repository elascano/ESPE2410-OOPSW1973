package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Alexander Ullco
 */

public class A {
    
    private ArrayList<A> as;

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }

    public A(ArrayList<A> as) {
        this.as = as;
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
}

