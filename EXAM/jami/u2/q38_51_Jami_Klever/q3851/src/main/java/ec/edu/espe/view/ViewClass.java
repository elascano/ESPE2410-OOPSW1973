package ec.edu.espe.view;

import ec.edu.espe.model.A;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;
import ec.edu.espe.model.F;
import ec.edu.espe.model.G;
import ec.edu.espe.model.H;
import ec.edu.espe.model.J;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Klever Jami
 */
public class ViewClass {
    
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
        G g = null;
        
        System.out.println(a);
        System.out.println(Arrays.toString(cs));
        System.out.println(Arrays.toString(ds));
        System.out.println(Arrays.toString(es));
        System.out.println(f);
       
        System.out.println(j);
    }
    
    
}
