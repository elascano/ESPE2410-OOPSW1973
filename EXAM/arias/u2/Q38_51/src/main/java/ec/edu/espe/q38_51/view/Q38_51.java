

package ec.edu.espe.q38_51.view;

import ec.edu.espe.q38_51.model.A;
import ec.edu.espe.q38_51.model.C;
import ec.edu.espe.q38_51.model.D;
import ec.edu.espe.q38_51.model.E;
import ec.edu.espe.q38_51.model.F;
import ec.edu.espe.q38_51.model.G;
import ec.edu.espe.q38_51.model.H;
import ec.edu.espe.q38_51.model.J;
import java.util.ArrayList;

/**
 *
 * @author Alan Arias
 */
public class Q38_51 {
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
        
        System.out.println("a --> "+a);
        System.out.println("cs --> "+cs.toString());
        System.out.println("ds --> "+ds.toString());
        System.out.println("es --> "+es.toString());
        System.out.println("f --> "+f);
        System.out.println("j --> "+j);
    }
}
