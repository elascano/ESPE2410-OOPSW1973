
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Marlon Pasquel
 */
public class WinMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("Im a WinMenu" + caption);
    }
    
    
}
