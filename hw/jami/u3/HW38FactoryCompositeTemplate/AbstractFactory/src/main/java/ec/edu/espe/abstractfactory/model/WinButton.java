package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public class WinButton extends Button {

    public WinButton() {
        this.caption = "Button";
    }

    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
