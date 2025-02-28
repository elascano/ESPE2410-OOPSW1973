package ec.edu.espe.abstractFactory.model;
import javax.swing.JButton;

/**
 *
 * @author Camila Bohorquez
 */
public class WinButton extends Button {

  public WinButton(String caption) {
        this.caption = caption;
    }

    @Override
    public JButton getButton() {
        return new JButton(caption);  
    }

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
