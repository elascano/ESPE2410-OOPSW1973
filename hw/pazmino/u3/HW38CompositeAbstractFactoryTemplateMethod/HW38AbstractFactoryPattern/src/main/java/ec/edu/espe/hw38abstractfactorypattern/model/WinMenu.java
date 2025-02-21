package ec.edu.espe.hw38abstractfactorypattern.model;

/**
 *
 * @author Brandon Pazmino
 */
public class WinMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("Im a WinMenu" + caption);
    }
    
    
}
