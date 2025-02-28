
package ec.edu.espe.Q3851.view;

import ec.edu.espe.Q3851.model.A;
import ec.edu.espe.Q3851.model.C;
import ec.edu.espe.Q3851.model.E;
import ec.edu.espe.Q3851.model.F;
import ec.edu.espe.Q3851.model.G;
import ec.edu.espe.Q3851.model.J;
import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class Main {
    public static void main(String[] args) {
        J j= new J();
        G g= new G();
        F f1= new F();
        F f2= new F();
        E e1= new E();
        E e2= new E();
        ArrayList<A> as= new ArrayList<>();
        A a= null;
        ArrayList<E> es= new ArrayList<>();
        es.add(e1);
        es.add(e2);
        
        System.out.println("This is a J-->" + j.toString());
        g.printJs(j);
    }
    
}
