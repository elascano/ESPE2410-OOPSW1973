package ec.edu.espe.abstractfactory.model;
import javax.swing.JButton;

/**
 *
 * @author David Cuichan
 */
public abstract class Button {
    protected String caption;
    public abstract JButton create();
}
