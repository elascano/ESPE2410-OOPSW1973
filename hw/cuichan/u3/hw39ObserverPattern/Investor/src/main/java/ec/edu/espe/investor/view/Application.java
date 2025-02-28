package ec.edu.espe.investor.view;

import ec.edu.espe.investor.model.IBM;
import ec.edu.espe.investor.model.Investor;

/**
 *
 * @author David Cuichan
 */
public class Application {

    public static void main(String[] args) {
        Investor s = new Investor("Sorros");
        Investor b = new Investor("Berkshire");

        IBM ibm = new IBM("IBM", 120.00);
        ibm.addObserver(s);
        ibm.addObserver(b);

        ibm.setPrice(120.10);
        ibm.setPrice(121.00);
        ibm.setPrice(120.50);
        ibm.setPrice(120.75);
        ibm.setSymbol("IBMTEST");
    }
}
