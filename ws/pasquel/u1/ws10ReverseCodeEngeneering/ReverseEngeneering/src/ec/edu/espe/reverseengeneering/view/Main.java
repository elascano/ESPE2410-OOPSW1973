
package ec.edu.espe.reverseengeneering.view;

import ec.edu.espe.reverseengeneering.model.A;
import ec.edu.espe.reverseengeneering.model.B;
import ec.edu.espe.reverseengeneering.model.C;
import ec.edu.espe.reverseengeneering.model.D;
import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Main {
    public static void main(String[] args) {
        A a;
        int aa;
        aa=3;
        B b;
        ArrayList<C> cs;
       D[] ds = new D[2];
       try{
       ds[0]= new D();
       ds[1]= new D();
       }
       catch (Exception ex){
           System.out.println("error"+ ex.getMessage()+ "pepito");
       }
       cs = new ArrayList<>();
       cs.add(new C());
       
       b = new B(cs, ds);
       a = new A(aa,b);
        System.out.println("a of type (A) --> " + a);
    }
}
