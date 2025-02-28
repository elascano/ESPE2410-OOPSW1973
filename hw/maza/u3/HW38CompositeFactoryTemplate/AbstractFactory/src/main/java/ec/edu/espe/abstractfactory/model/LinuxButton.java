
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author gustavo
 */
public class LinuxButton extends Button {
    public LinuxButton(String caption) {
        this.caption = caption;
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}
