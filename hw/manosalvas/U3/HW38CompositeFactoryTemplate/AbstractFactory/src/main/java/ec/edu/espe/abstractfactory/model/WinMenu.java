
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Gabriel Manosalvas
 */
public class WinMenu extends Menu {
    public WinMenu(String caption) {
        this.caption = caption;
    }

    @Override
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
}
