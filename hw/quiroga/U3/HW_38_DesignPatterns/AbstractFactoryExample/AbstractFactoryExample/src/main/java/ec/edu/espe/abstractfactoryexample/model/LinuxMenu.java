
package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class LinuxMenu extends Menu{
    @Override
        public void paint() {
            System.out.println("I'm a LinuxMenu: "+caption);
        }
}
