

package ec.edu.espe.reverseengineering.view.Main;

import ec.edu.espe.reverseengineering.model.A;
import ec.edu.espe.reverseengineering.model.B;
import ec.edu.espe.reverseengineering.model.C;
import ec.edu.espe.reverseengineering.model.D;
import java.util.ArrayList;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Main {
    public static void main(String[] args) {
        A a;
        int aa;
        aa = 3;
        B b;
        ArrayList<C> cs;
        D[] ds = new D[2];
        try{
        ds[0] = new D();
        ds[1] = new D();
        ds[1] = new D();
        }
        catch (Exception ex){
            System.out.println("Error " + ex.getMessage() + " pepito");
            System.out.println("You can only have two mirror here : \n would you like to try again Y/N ...");
        }
        
        cs = new ArrayList<>();
        cs.add(new C());
        cs.add(new C());
        b = new B(cs, ds);
        a = new A(aa,b);
        System.out.println("a of type (A) --->"+ a);
    }
}
