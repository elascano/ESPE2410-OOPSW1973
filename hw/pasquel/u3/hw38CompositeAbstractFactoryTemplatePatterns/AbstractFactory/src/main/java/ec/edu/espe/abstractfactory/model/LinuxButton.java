
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Marlon Pasquel
 */
public class LinuxButton extends Button{

    @Override
    public void paint() {
        System.out.println("Im a LinuxButton" + caption);
    }
    
}
