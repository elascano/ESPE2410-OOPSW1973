package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Mateo Topon
 */
public class LinuxButton extends Button {
    public LinuxButton() {
        this.caption = "Button";
    }
    public void paint() {
        System.out.println("Linux-Button ----> " + caption);
    }
}