package tenantdata;

/**
 *
 * @author Alexander Maza
 */
public class CondoApp {
    private int idApartamento;
    private String inquilino;
    private int numHabitaciones;
    private boolean ocupado;

    public CondoApp(int idApartamento, String inquilino, int numHabitaciones, boolean ocupado) {
        this.idApartamento = idApartamento;
        this.inquilino = inquilino;
        this.numHabitaciones = numHabitaciones;
        this.ocupado = ocupado;
    }

    public int getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    @Override
    public String toString() {
        return "Apartament{" + "idApartamento=" + idApartamento + ", inquilino=" + inquilino + ", numHabitaciones=" + numHabitaciones + ", ocupado=" + ocupado + '}';
    }

    
}
