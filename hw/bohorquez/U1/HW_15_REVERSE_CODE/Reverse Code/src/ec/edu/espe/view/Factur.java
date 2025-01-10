package ec.edu.espe.view;
/**
 *
 * @author Camila Bohorquez
 */
import java.util.ArrayList;

public class Factur{
    private int idFactur;
    private ArrayList<Orden> ordenes;
    private double total;

    
    public Factur(int idFactur) {
        this.idFactur = idFactur;
        this.ordenes = new ArrayList<>();
        this.total = 0.0;
    }

    
    public int getIdFactur() {
        return idFactur;
    }

    public void setIdFactur(int idFactur) {
        this.idFactur = idFactur;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    @Override
    public String toString() {
        return "Factura [ID=" + idFactur + ", Total=" + total + "]";
    }
}

