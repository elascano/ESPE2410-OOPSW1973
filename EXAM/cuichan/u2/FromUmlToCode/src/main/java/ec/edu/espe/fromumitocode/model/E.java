package ec.edu.espe.fromumitocode.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Cuichan
 */
public class E {
    private List<C> relationC;
    private List<D> relationD;

    public E() {
        this.relationC = new ArrayList<>();
        this.relationD = new ArrayList<>();
    }
     public void addRealationC(C c) {
        relationC.add(c);
    }

    public void addRelationD(D d) {
        relationD.add(d);
    }
}
