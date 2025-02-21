
package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class LinuxFactory extends GUIFactory {

     @Override
    public Button createButton() {
        return(new LinuxButton());
    }

    @Override
    public Menu createMenu() {
        return(new LinuxMenu());
    }

}
