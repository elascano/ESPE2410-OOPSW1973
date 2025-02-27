package ec.edu.espe.abstractfactory.model;

import javax.swing.JButton;

/**
 *
 * @author David Cuichan
 */
public class LinuxButton extends Button{

    public LinuxButton() {
        this.caption = "Linux Button";
    }

    @Override
    public JButton create() {
        return new JButton(this.caption);
    }

}
