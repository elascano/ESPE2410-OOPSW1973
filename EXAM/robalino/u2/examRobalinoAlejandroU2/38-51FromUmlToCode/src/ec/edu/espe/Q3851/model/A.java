package ec.edu.espe.Q3851.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABS-DCCO
 */
public class A {
    private A compositionA; 
    private List<A> aggregationA; 
    
    public A() {
        aggregationA = new ArrayList<>();
}
 
    public void setCompositionA(A a) {
        this.compositionA = a;
    }
    
    public void addAggregationA(A a) {
        aggregationA.add(a);
    }
}

