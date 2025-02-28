
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Gabriel Manosalvas
 */
public class LinuxMenu extends Menu {
    public LinuxMenu(String caption) {
        this.caption = caption;
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}