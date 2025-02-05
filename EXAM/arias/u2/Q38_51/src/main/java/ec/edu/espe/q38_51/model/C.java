package ec.edu.espe.q38_51.model;
import java.util.ArrayList;

/**
 *
 * @Alan Arias
 */
public class C extends A{

    private ArrayList<E> e;
    
    public C(ArrayList<E> e, ArrayList<A> as) {
        super(as);
        this.e = e;
    }

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
}
