package ec.edu.espe.abstractfactory.model;

import javax.swing.JButton;

/**
 *
 * @author David Cuichan
 */
public class WinButton extends Button{

    public WinButton() {
        this.caption = "Windows Button";
    }

    @Override
    public JButton create() {
        return new JButton(this.caption);
    }
    
}
