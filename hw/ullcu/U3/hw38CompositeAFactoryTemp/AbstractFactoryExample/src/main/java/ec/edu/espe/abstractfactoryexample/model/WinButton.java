

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alexander Ullco
 */
public class WinButton extends Button {
      public WinButton() {
        this.caption = "Press Button";
    }
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}