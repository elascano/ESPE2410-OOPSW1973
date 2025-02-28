

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alan Arias
 */
public class WinButton extends Button {
      public WinButton() {
        this.caption = "Button";
    }
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}