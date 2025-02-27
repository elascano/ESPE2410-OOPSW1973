package ec.edu.espe.abstractfactory.model;
/**
 *
 * @author gustavo
 */
public class WinButton extends Button {
    
    public WinButton(String caption) {
        this.caption = caption;
    }

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
