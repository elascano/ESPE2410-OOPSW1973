package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Sebastian Charij
 */
public class C extends A{
    
    private ArrayList<E> e;
    
    public C(ArrayList<E> e, ArrayList<A> as) {
        super(as);
        this.e = e;
    }

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
}
