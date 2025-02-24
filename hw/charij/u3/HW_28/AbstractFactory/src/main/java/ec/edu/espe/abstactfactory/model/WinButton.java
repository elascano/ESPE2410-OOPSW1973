package ec.edu.espe.hw25_abstactfactory.model;

/**
 *
 * @author Sebastian Charij
 */
public class WinButton extends Button {

    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
