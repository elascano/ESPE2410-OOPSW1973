package ec.edu.espe.q3851.model;

import java.util.ArrayList;

public class A {
    ArrayList<A> as;

    @Override
    public String toString() {
        return "A" + "composed" + as + '}';
    }    
    
    public A(ArrayList<A> aa) {
        this.as = as;
    }
    
  
}
