package ec.edu.espe.abstractFactory.model;
import javax.swing.JButton;

/**
 *
 * @author Camila Bohorquez
 */
public abstract class Button {
    public String caption;
    public abstract JButton getButton();
    public abstract void paint();
}
