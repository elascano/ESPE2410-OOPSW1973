
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Marlon Pasquel
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("Im a WinButton" + caption);
    }
    
}
