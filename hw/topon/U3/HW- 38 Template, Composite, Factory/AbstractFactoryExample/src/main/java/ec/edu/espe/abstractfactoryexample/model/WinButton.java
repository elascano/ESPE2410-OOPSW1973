package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Mateo Topon
 */
public class WinButton extends Button {
      public WinButton() {
        this.caption = "Button";
    }
    public void paint() {
        System.out.println("Win-Button --->  " + caption);
    }
}