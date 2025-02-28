package ec.edu.espe.reverseengineering.view;

import ec.edu.espe.reverseengineering.model.A;
import ec.edu.espe.reverseengineering.model.B;
import ec.edu.espe.reverseengineering.model.C;
import ec.edu.espe.reverseengineering.model.D;
import java.util.ArrayList;

/**
 *
 * @author Camila Bohorquez
 */
public class Main {
    public static void main(String[] args) {
        
        A a;
        int aa = 3; 
        B b;
        ArrayList<C> cs = new ArrayList<>();
        D[] ds = new D[2]; 
        try{
        ds[0] = new D();
        ds[1] = new D();
        ds [2]=new D();
        }catch (Exception ex){
            System.out.println("Error"+ ex.getMessage()+"pepito");
            System.out.println("You can only have two mirrows in the car");
            System.out.println("Do you want to try again");
        }
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        
        b = new B(cs, ds); 
        a = new A(aa, b); 
        
        
        System.out.println("a of type (A) --> " + a);
    }
}
