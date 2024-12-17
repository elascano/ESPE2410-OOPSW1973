package ec.edu.espe.reverseengineering.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Camila Bohorquez
 */
public class B {
    private ArrayList <C> cs;
    private D d[];
    
    
     public B(ArrayList<C> cs, D[] d) {
        
        this.cs = cs;
        this.d = d;
    }

    @Override
    public String toString() {
        String ds="";
        for (D d1 : d) {
            ds = ds+"," + d1;
        }
        return "B{" + "cs=" + cs + ", d=" + Arrays.toString(d) + '}';
    }
     
    
   

    public ArrayList<C> getCs() {
        return cs;
    }

    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    public D[] getD() {
        return d;
    }

    public void setD(D[] d) {
        this.d = d;
    }
    
    
    
}
