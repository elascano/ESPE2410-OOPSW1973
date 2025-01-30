 
package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Topon
 */
public class D extends A {
    private E e[] = new E[5];
    private ArrayList<F> f;

    public D(){
        
    }
    
    public D(ArrayList<F> f, A a) {
        super(a);
        this.f = f;
    }

    @Override
    public String toString() {
        return "D{" + "e=" + e + ", f=" + f + '}';
    }
    
    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }

    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
    }
    
    
}
