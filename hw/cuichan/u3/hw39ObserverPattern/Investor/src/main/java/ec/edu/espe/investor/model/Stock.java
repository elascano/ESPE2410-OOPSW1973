package ec.edu.espe.investor.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author David Cuichan
 */
public abstract class Stock {
    protected String symbol;
    protected double price;
    private ArrayList<IInvestor> investors = new ArrayList<>();
    String getSymbol;

    public Stock() { }

    public void addObserver(IInvestor iinvestor) {
        investors.add(iinvestor);
    } 

    public void deleteObserver(IInvestor iinvestor) {
        investors.remove(iinvestor);
    } 

    public void notifyObservers(Object args) {
        Iterator<IInvestor> i = investors.iterator();
        while (i.hasNext()) {
            IInvestor investor = i.next();
            investor.update(this, args);
        }
    }

    String getSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
