package ec.edu.espe.hw38abstractfactorypattern.model;

/**
 *
 * @author Brandon Pazmino
 */
public class LinuxButton extends Button{

    @Override
    public void paint() {
        System.out.println("Im a LinuxButton" + caption);
    }
    
}
