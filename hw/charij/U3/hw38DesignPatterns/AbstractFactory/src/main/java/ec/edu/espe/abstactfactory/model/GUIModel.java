package ec.edu.espe.hw25_abstactfactory.model;

/**
 *
 * @author Sebastian Charij
 */
public class GUIModel {

    private Button button;
    private Menu menu;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Button getButton() {
        return button;
    }

    public Menu getMenu() {
        return menu;
    }
}
