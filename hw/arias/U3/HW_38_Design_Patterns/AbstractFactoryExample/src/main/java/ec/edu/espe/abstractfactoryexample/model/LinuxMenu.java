

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alan Arias
 */
    public class LinuxMenu extends Menu {
    public LinuxMenu() {
      this.caption = "Menu";
    }

    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
