
package ec.edu.espe.mycompany.q3851.view;

import ec.espe.edu.q3851.model.A;
import ec.espe.edu.q3851.model.C;
import ec.espe.edu.q3851.model.D;
import ec.espe.edu.q3851.model.E;
import ec.espe.edu.q3851.model.F;
import ec.espe.edu.q3851.model.G;
import ec.espe.edu.q3851.model.H;
import ec.espe.edu.q3851.model.J;
import java.util.ArrayList;

/**
 * author Alexander Maza
 */
public class TheoryExcercise {

    public static void main(String[] args) {
        ArrayList<A> as = new ArrayList<>();
        ArrayList<E> nonlimitedEs = new ArrayList<>();
        E[] es = new E[5];
        C[] cs = new C[3];
        D[] ds = new D[4];
        ArrayList<H> hs = new ArrayList<>();
        for(C c : cs){
            c = new C(nonlimitedEs, as);
        }
        
        A a = new  A(as);
        F f = new F();
        J j = new J();
        G g = new G(j);
        
        System.out.println(a);
        System.out.println(cs.toString());
        System.out.println(ds.toString());
        System.out.println(es.toString());
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
    }
    
}
