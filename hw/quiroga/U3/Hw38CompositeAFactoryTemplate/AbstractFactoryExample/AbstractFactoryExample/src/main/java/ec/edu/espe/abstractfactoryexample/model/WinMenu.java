
package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class WinMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("I'm a WinMenu: "+caption);
    }

}
