package ec.edu.espe.view;
/**
 *
 * @author Camila Bohorquez
 */
public class SaleNote {
    private int idNota;
    private Factur factur;
    private String fecha;

   
    public SaleNote(int idNota, Factur factur, String fecha) {
        this.idNota = idNota;
        this.factur = factur;
        this.fecha = fecha;
    }

   
    public int getIdNote() {
        return idNota;
    }

    public void setIdNote(int idNote) {
        this.idNota = idNota;
    }

    public Factur getFactur() {
        return factur;
    }

    public void setFactur(Factur factur) {
        this.factur = factur;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Override
    public String toString() {
        return "NotaDeVenta [ID=" + idNota + ", Fecha=" + fecha + ", Factura=" + factur + "]";
    }
}

