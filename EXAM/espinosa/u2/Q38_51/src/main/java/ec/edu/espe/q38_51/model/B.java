package ec.edu.espe.q38_51.model;

import java.util.ArrayList;

/**
 *
 * @author Andrés Espinosa
 */
public class B extends A{
    private ArrayList<H> h = new ArrayList<>();

    public B(A a) {
        super(a);
    }

    

    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }
    
    
    
    

}
