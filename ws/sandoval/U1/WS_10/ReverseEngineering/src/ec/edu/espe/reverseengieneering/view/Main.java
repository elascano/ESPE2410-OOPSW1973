package ec.edu.espe.reverseengieneering.view;

import ec.edu.espe.reverseengieneering.model.A;
import ec.edu.espe.reverseengieneering.model.B;
import ec.edu.espe.reverseengieneering.model.C;
import ec.edu.espe.reverseengieneering.model.D;
import java.util.ArrayList;

/**
 *
 * @author Andres Sandoval
 */
public class Main {
    public static void main(String[] args){
        A a;
        int aa;
        aa= 3;
        B b;
        ArrayList<C> cs;
        D[] ds = new D[2];
        
        try{
        ds[0] = new D();
        ds[1] = new D();
        ds[2] = new D();
        ds[3] = new D();
        }
        catch (Exception ex){
            System.out.println("error " + ex.getMessage() + " pepito");
            System.out.println("You can only have two mirrors in the car");
            System.out.println("Do you want to try again Y/N...");
        }
        
        cs =new ArrayList<>();
        cs.add(new C());
        
        b =new B(cs, ds);
        a =new A(aa, b);
        
        System.out.println("a of type (A) --> " + a);
        
    
    }

}
