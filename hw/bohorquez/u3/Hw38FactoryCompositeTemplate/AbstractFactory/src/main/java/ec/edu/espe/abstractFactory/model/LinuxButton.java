package ec.edu.espe.abstractFactory.model;
import ec.edu.espe.abstractFactory.model.Button;
import javax.swing.JButton;
/**
 *
 * @author Camila Bohorquez
 */
public class LinuxButton extends Button {
 public LinuxButton(String caption) {
        this.caption = caption;
    }
    @Override
    public JButton getButton() {
    return new JButton(caption);
    }
    
     public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}