

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alexander Ullco
 */
    public class LinuxMenu extends Menu {
    public LinuxMenu() {
      this.caption = "Menu";
    }

    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
