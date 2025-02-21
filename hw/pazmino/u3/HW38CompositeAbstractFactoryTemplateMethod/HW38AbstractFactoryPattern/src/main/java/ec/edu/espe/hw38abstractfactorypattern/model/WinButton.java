package ec.edu.espe.hw38abstractfactorypattern.model;

/**
 *
 * @author Brandon Pazmino
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("Im a WinButton" + caption);
    }
    
}
