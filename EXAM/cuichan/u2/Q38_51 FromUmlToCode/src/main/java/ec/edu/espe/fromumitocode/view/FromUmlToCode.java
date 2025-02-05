package ec.edu.espe.fromumitocode.view;

import ec.edu.espe.fromumitocode.model.A;
import ec.edu.espe.fromumitocode.model.B;
import ec.edu.espe.fromumitocode.model.C;
import ec.edu.espe.fromumitocode.model.D;
import ec.edu.espe.fromumitocode.model.E;
import ec.edu.espe.fromumitocode.model.F;
import ec.edu.espe.fromumitocode.model.G;
import ec.edu.espe.fromumitocode.model.H;
import ec.edu.espe.fromumitocode.model.J;
import java.util.ArrayList;

/**
 *
 * @author David Cuichan
 */
public class FromUmlToCode {

    public static void main(String[] args) {
        ArrayList<A> listA = new ArrayList<>();
        
        A elementA = new A(listA);
        
        System.out.println("-->"+elementA.toString());
        ArrayList<H> h = null;
        
        B elementB = new B(h, listA);
        System.out.println("-->"+elementB.toString());
        
        C elementC = new C(listA);
        ArrayList<F> listF = new ArrayList<>();
        System.out.println("-->"+elementC.toString());
        
        D elementD  = new D(listF, listA);
        System.out.println("-->"+elementD.toString());
        
        E elementE = new E();
        System.out.println("-->"+elementE.toString());
        
        F elementF = new F();
        System.out.println("-->"+elementF.toString());
        
        G elementG = new G();
        System.out.println("-->"+elementG.toString());
        
        H elementH=null;
        System.out.println("-->"+elementH);
        
        J elementj = new J();
        System.out.println("-->"+elementj.toString());
    }
}
