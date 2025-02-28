

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Robinson Bonilla
 */
public class WinMenu extends Menu {
    public WinMenu() {
        this.caption = "Menu";
    }
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
}