package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public class LinuxMenu extends Menu {

    public LinuxMenu() {
        this.caption = "Menu";
    }

    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
