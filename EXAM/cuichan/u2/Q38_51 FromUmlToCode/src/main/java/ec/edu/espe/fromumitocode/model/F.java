package ec.edu.espe.fromumitocode.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Cuichan
 */
public class F {
    private List<D> relationD;

    public F() {
        this.relationD = new ArrayList<>();
    }

    public void add(D d) {
        relationD.add(d);
    }
}
