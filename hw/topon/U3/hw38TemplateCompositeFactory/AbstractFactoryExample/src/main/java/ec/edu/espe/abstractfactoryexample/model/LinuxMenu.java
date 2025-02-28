package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Mateo Topon
 */
    public class LinuxMenu extends Menu {
    public LinuxMenu() {
      this.caption = "Menu";
    }

    public void paint() {
        System.out.println("Linux-Menu---> " + caption);
    }
}
