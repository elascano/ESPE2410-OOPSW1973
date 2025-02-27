package ec.edu.espe.abstractfactory.model;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author David Cuichan
 */
public class WinMenu extends Menu{

    public WinMenu() {
        this.caption = "Windows Menu";
    }

    @Override
    public JMenuBar create() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu(this.caption);
        menuBar.add(menu);
        return menuBar;
    }
    
}
