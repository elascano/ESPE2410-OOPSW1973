package ec.edu.espe.fromumitocode.model;

import java.util.ArrayList;

/**
 *
 * @author David CUichan
 */
public class A {
    private ArrayList<A> listA;

    public A(ArrayList<A> listA) {
        this.listA = listA;
    }

    /**
     * @return the listA
     */
    public ArrayList<A> getListA() {
        return listA;
    }

    /**
     * @param listA the listA to set
     */
    public void setListA(ArrayList<A> listA) {
        this.listA = listA;
    }

    public Object getList() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "A{" + "listA=" + listA + '}';
    }
}
