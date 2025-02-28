
package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: "+ caption);
    }

}
