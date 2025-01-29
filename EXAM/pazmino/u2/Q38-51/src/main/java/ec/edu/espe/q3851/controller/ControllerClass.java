
package ec.edu.espe.q3851.controller;

import ec.edu.espe.q3851.model.A;
import ec.edu.espe.q3851.model.B;
import ec.edu.espe.q3851.model.C;
import ec.edu.espe.q3851.model.D;
import ec.edu.espe.q3851.model.E;
import ec.edu.espe.q3851.model.F;
import ec.edu.espe.q3851.model.G;
import ec.edu.espe.q3851.model.J;
import ec.edu.espe.q3851.view.Main;
import javax.swing.text.View;

/*
*
* @user Brandon PAzmino
*/

public class ControllerClass {
    private A aInstance;
    private B bInstance;
    private C cInstance;
    private D dInstance;
    private E eInstance;
    private F fInstance;
    private G gInstance;
    private J jInstance;
    private Main viewClass;

    public ControllerClass(A aInstance, B bInstance, C cInstance, D dInstance, E eInstance, F fInstance, G gInstance,J jInstance, View view) {
        this.aInstance = aInstance;
        this.bInstance = bInstance;
        this.cInstance = cInstance;
        this.dInstance = dInstance;
        this.eInstance = eInstance;
        this.fInstance = fInstance;
        this.gInstance = gInstance;
        this.jInstance = jInstance;
        this.viewClass = viewClass;
    }

    public void executeLogic() {
        System.out.println("Lógica del constructur de instancias de las clases In the UML Diagram");
    }
}