package ec.edu.espe.abstractFactory.model;
import javax.swing.JMenu;

/**
 *
 * @author Camila Bohorquez
 */
public abstract class Menu {
    
    public String caption;
    public abstract JMenu getMenu();
    public abstract void paint();
}