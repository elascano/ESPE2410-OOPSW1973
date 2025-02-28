package ec.edu.espe.reverseEngineering.view;

import ec.edu.espe.reverseEngineering.model.A;
import ec.edu.espe.reverseEngineering.model.B;
import ec.edu.espe.reverseEngineering.model.C;
import ec.edu.espe.reverseEngineering.model.D;
import java.util.ArrayList;

/**
 *
 * @author David Cuichan
 */
public class Main {
    public static void main(String[] args) {
        A a;
        int aa;
        aa = 3;
        B b;
        ArrayList<C> cs;
        D[] ds = new D[2];
        try {
            ds[0] = new D();
            ds[1] = new D();
            ds[2] = new D();
        }catch (Exception ex){
            System.out.println("ERROR "+ ex.getMessage()+"pepito");
            System.out.println("You can only have two mirrors in the car");
            System.out.println("Do yo want to try again Y/N...");
        }
        
        cs = new ArrayList<>();
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        
        
        b = new B(cs,ds);
        a = new A(aa,b);
        
        System.out.println("a of type (A) -->" + a);
    }
}
