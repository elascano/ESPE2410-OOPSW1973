package ec.edu.espe.Factory.model;

/**
 *
 * @author Benjamin R
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("Im a WinButton" + caption);
    }
    
}
