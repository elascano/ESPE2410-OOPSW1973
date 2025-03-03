package ec.edu.espe.Q3851.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABS-DCCO
 */
class B extends A {
    private List<H> Hs; 
    
    public B() {
        Hs = new ArrayList<>();
    }
    
    public void addH(H h) {
        Hs.add(h);
    }
}
