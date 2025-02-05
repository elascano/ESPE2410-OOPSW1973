
package ec.edu.espe.q3851.view;
import ec.edu.espe.q3851.model.B;
import ec.edu.espe.q3851.model.A;
import ec.edu.espe.q3851.model.J;
import ec.edu.espe.q3851.model.F;
import ec.edu.espe.q3851.model.D;
import ec.edu.espe.q3851.model.E;
import ec.edu.espe.q3851.model.C;
import ec.edu.espe.q3851.model.G;
import ec.edu.espe.q3851.controller.DisplayedInformation;
import ec.edu.espe.q3851.controller.ControllerClass;

/**
 *
 * @author Brandon Pazmino
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        A aInstance = new A();
        B bInstance = new B();
        C cInstance = new C();
        D dInstance = new D();
        E eInstance = new E();
        F fInstance = new F();
        G gInstance = new G();
        J jInstance = new J();

        eInstance.addRealationC(cInstance);
        eInstance.addRelationD(dInstance);
        fInstance.agregarRelacionD(dInstance);
        
        DisplayedInformation view = new DisplayedInformation();
        javax.swing.text.View View = null;
        ControllerClass controller = new ControllerClass(aInstance, bInstance, cInstance, dInstance, eInstance, fInstance, gInstance, jInstance, View);


        view.displayInformation("Instance of A --> " + aInstance);
        view.displayInformation("Instance of B:-->"+ bInstance);
        view.displayInformation("Instance of C: -->" + cInstance);
        view.displayInformation("Instance of D: -->" + dInstance);
        view.displayInformation("Instance of E: -->" + eInstance);
        view.displayInformation("Instance of F:--> " + fInstance);
        view.displayInformation("Instance of G: -->" + gInstance);
        view.displayInformation("Instance of J: --_>" + jInstance);

        controller.executeLogic();
    }
    
}
