package ec.edu.espe.Factory.model;

/**
 *
 * @author Benjamin R
 */
public class LinuxButton extends Button{

    @Override
    public void paint() {
        System.out.println("Im a LinuxButton" + caption);
    }
    
}
