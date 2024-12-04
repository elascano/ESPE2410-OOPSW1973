package ec.edu.espe.reverseengineering.view;

import ec.edu.espe.reverseenginering.model.A;
import ec.edu.espe.reverseenginering.model.B;
import ec.edu.espe.reverseenginering.model.C;
import ec.edu.espe.reverseenginering.model.D;
import java.util.ArrayList;
import utils.JsonFileManager;

/**
 *
 * @author Jose Leiton
 */
public class Main {

    public static void main(String[] args) {
        
        PrintMainMenu();
       
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
        } catch (Exception ex) {
            System.out.println("error " + ex.getMessage() + "Pepito");
            System.out.println("You can only have two mirrors in the car");
            System.out.println("Do you want to try again Y/N ...");
        }
        cs = new ArrayList<>();
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());
        cs.add(new C());

        b = new B(cs, ds);
        a = new A(aa, b);

        cs.add(new C());
        cs.add(new C());

        System.out.println("a of type (A) -->" + a);
    }


    private static void PrintMainMenu() {
        System.out.println("menu");
        System.out.println("op1");
        System.out.println("op2");
        System.out.println("op3");
        System.out.println("elija una opcion");
    }
}
