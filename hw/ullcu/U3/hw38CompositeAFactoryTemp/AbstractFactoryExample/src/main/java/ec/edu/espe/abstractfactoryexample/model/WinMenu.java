

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alexander Ullco
 */
public class WinMenu extends Menu {
    public WinMenu() {
        this.caption = " Press Menu";
    }
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
}