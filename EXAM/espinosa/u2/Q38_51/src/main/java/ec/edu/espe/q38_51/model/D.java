package ec.edu.espe.q38_51.model;

/**
 *
 * @author Andrés Espinosa
 */
public class D extends A{
    private F f;

    public D(F f, A a) {
        super(a);
        this.f = f;
    }

    
    

    /**
     * @return the f
     */
    public F getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(F f) {
        this.f = f;
    }
    
    
}
