package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Sebastian Charij
 */
public class B extends A{
    
    private ArrayList<H> h = new ArrayList<>(1);

    public B(ArrayList<A> as) {
        super(as);
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }
    
    public ArrayList<H> getH() {
        return h;
    }

    public void setH(ArrayList<H> h) {
        this.h = h;
    }
    
    
}
