
package ec.espe.edu.q3851.model;

import java.util.ArrayList;

/**
 * author Alexander Maza
 */
public class D extends A{
    E[] es;
    ArrayList<F> fs;

    public D(E[] es, ArrayList<F> fs, ArrayList<A> as) {
        super(as);
        if(fs != null){
           
            this.es = es;
            this.fs = fs;
        }
 
    }
    
    @Override
    public String toString() {
        return " D " + " is an aggregation of " + es + " composed by " + fs + " extends --> " + super.toString();
    }
    
    
    
}
