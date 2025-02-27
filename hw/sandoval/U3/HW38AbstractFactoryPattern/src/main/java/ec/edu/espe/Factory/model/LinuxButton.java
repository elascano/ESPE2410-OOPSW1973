package ec.edu.espe.Factory.model;

/**
 *
 * @author Andrés Sandoval
 */
public class LinuxButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a Windows " + caption);
    }
    
}
