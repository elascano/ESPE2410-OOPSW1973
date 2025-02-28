

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Robinson Bonilla
 */
public class LinuxButton extends Button {
    public LinuxButton() {
        this.caption = "Button";
    }
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}