
package ec.edu.espe.abstractfactoryexample.view;

import ec.edu.espe.abstractfactoryexample.controller.GUIController;

/**
 *
 * @author Robinson Bonilla
 */
public class AbstractFactoryApp {

    public static void main(String[] args) {
        GUIController controller = new GUIController();
        controller.renderComponents();
    }
}
