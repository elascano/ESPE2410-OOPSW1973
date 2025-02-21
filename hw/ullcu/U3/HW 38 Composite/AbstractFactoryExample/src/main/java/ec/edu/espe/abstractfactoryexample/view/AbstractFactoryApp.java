
package ec.edu.espe.abstractfactoryexample.view;

import ec.edu.espe.abstractfactoryexample.controller.GUIController;

/**
 *
 * @author Alexander Ullco
 */
public class AbstractFactoryApp {

    public static void main(String[] args) {
        GUIController controller = new GUIController();
        controller.renderComponents();
    }
}
