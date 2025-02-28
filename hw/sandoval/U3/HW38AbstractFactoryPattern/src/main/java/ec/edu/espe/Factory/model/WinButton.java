package ec.edu.espe.Factory.model;

/**
 *
 * @author Andrés Sandoval
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a WinButton" + caption);
    }
    
}
