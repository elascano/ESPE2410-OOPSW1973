 
package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Topon
 */
public class B extends A {
    private ArrayList<H> h;

    public B(){
        
    }
    
    public B(ArrayList<H> h, A a) {
        super(a);
        this.h = h;
    }
    
    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
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
