
package ec.edu.espe.q3851.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brandon PAzmino
 */
public class F {
    private List<D> relationD;

    public F() {
        this.relationD = new ArrayList<>();
    }

    public void agregarRelacionD(D d) {
        relationD.add(d);
    }
   
}
