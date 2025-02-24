package ec.edu.espe.hw25_abstractfactory.view;

import ec.edu.espe.hw25_abstactfactory.model.Button;
import ec.edu.espe.hw25_abstactfactory.model.Menu;

/**
 *
 * @author Sebastian Charij
 */
public class GUIView {

    public void display(Button button, Menu menu) {
        button.paint();
        menu.paint();
    }
}
