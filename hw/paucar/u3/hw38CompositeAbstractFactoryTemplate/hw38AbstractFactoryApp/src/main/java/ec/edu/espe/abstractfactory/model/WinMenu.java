package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Dennis Paucar
 */
public class WinMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
    
}
