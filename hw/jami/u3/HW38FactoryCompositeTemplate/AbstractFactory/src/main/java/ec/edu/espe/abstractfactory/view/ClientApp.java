package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.controller.GUIController;

/**
 *
 * @author Klever Jami
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIController controller = new GUIController();
        controller.renderComponents();
    }
}
