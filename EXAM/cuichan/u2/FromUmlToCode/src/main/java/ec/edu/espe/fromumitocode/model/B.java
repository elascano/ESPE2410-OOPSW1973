package ec.edu.espe.fromumitocode.model;

import java.util.ArrayList;

/**
 *
 * @author David Cuichan
 */
public class B extends A{
    
private ArrayList <H> listH;

    public B(ArrayList<H> h, ArrayList<A> listA) {
        super(listA);
        this.listH = h;
    }

    /**
     * @return the listH
     */
    public ArrayList <H> getListH() {
        return listH;
    }

    /**
     * @param listH the listH to set
     */
    public void setListH(ArrayList <H> listH) {
        this.listH = listH;
    }

    @Override
    public String toString() {
        return "B{" + "listH=" + listH + '}';
    }
    
}
