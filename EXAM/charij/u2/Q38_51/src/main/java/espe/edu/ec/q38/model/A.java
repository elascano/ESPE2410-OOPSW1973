package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Sebastian Charij
 */

public class A {
    
    private ArrayList<A> as;

    @Override
    public String toString(){
        return "A{" + "as=" + as + '}';
    }

    public A(ArrayList<A> as) {
        this.as = as;
    }


    public ArrayList<A> getAs() {
        return as;
    }


    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
}

