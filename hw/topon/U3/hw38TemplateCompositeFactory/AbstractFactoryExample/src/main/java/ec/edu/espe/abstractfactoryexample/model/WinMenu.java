package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Mateo Topon
 */
public class WinMenu extends Menu {
    public WinMenu() {
        this.caption = "Menu";
    }
    public void paint() {
        System.out.println("Win-Menu ---> " + caption);
    }
}