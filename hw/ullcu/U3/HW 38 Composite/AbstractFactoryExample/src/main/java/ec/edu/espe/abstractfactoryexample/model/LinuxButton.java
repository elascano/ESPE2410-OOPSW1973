

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alexander Ullco
 */
public class LinuxButton extends Button {
    public LinuxButton() {
        this.caption = "Button";
    }
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}