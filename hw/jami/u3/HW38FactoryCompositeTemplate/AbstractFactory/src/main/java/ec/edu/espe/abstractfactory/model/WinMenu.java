package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public class WinMenu extends Menu {

    public WinMenu() {
        this.caption = "Menu";
    }

    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
}
