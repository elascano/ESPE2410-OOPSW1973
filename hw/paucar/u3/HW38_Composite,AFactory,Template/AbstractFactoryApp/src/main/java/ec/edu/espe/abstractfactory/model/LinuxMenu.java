package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Dennis Paucar
 */
public class LinuxMenu extends Menu{

    @Override
    public void paint() {
       System.out.println("I'm a WinMenu: " + caption);
    }
    
}
