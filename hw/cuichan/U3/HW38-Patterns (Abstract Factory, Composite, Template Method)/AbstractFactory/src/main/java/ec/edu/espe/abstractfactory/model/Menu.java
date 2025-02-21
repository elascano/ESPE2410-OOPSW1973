package ec.edu.espe.abstractfactory.model;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
/**
 *
 * @author David Cuichan
 */
public abstract class Menu {
    protected String caption;
    public abstract JMenuBar create();
}
