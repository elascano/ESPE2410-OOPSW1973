package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public class LinuxButton extends Button {

    public LinuxButton() {
        this.caption = "Button";
    }

    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}
