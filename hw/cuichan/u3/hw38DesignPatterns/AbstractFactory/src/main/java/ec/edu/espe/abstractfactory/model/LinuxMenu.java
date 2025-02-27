package ec.edu.espe.abstractfactory.model;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author David Cuichan
 */
public class LinuxMenu extends Menu{

    public LinuxMenu() {
        this.caption = "Linux Menu";
    }

    @Override
    public JMenuBar create() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu(this.caption);
        menuBar.add(menu);
        return menuBar;
    }

}
