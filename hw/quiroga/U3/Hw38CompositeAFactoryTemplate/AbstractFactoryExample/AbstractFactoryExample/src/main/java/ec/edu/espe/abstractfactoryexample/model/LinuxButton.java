
package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class LinuxButton extends Button{
 @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: "+ caption);
    }
}
