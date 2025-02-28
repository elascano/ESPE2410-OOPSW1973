package ec.edu.espe.abstractFactory.model;
import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author Camila Bohorquez
 */
public  class LinuxFactory extends GUIFactory {

    public Button createButton(String caption) {
        return new LinuxButton(caption);  
    }

    public Menu createMenu(String caption) {
        return new LinuxMenu(caption);  
    }


}
