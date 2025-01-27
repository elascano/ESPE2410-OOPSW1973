
package ec.edu.espe.controller;

import ec.edu.espe.model.A;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;
import ec.edu.espe.model.F;
import ec.edu.espe.model.G;
import ec.edu.espe.model.J;
import ec.edu.espe.view.Main;
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