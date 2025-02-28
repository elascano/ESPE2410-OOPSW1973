package ec.edu.espe.abstractFactory.controller;
import ec.edu.espe.abstractFactory.model.GUIFactory;
import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Camila Bohorquez
 */
public class AppController {
    private GUIFactory factory;
    private Button button;
    private Menu menu;

    public AppController() {
         this.factory = GUIFactory.getFactory();
        this.button = factory.createButton("Play");  
        this.menu = factory.createMenu("Main Menu"); 
    }

    public void setButtonCaption(String caption) {
        this.button.caption = caption;  
    }

    public void setMenuCaption(String caption) {
        this.menu.caption = caption;  
    }

     public void renderUI(JPanel panel, JMenuBar menuBar) {

        panel.add(button.getButton());

      
        menuBar.add(menu.getMenu());
    }
}
