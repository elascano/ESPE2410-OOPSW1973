
package ec.edu.espe.reverseengineering.view;

import ec.edu.espe.reverseengineering.model.A;
import ec.edu.espe.reverseengineering.model.B;
import ec.edu.espe.reverseengineering.model.C;
import ec.edu.espe.reverseengineering.model.D;
import java.util.ArrayList;

/**
 *
 * @author Esteban Quiroga 
 */
public class Main {
    public static void main(String[] args) {
        A a;
        int aa;
        aa = 3;
        B b;
        ArrayList<C> cs;
        D[] ds = new D[2];
        ds[0] = new D();
        ds[1] = new D();
        
        cs = new ArrayList<>();
        cs.add(new C());
        
        b = new B(cs, ds);
        a = new A(aa, b);
        
        System.out.println("a of type (A) --> "+a);
    }
}
