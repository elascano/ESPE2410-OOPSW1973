package ec.edu.espe.compositepattern.view;

/**
 *
 * @author Gabriel Manosalvas
 */
public class President extends Employee {
    private static President president = new President();

    private President() {
        this.title = "President";
    }

    public static President getPresident(String aName) {
        president.name = aName;
        return president;
    }

    @Override
    public void stateName() {
        System.out.println("Special processing for presidential naming");
        super.stateName();
    }
}
