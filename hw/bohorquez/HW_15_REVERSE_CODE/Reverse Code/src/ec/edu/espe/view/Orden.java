package ec.edu.espe.view;
/**
 *
 * @author Camila Bohorquez
 */
 public class Orden{
    private int idOrden;
    private String descripcion;
    private double precio;

   
    public Orden(int idOrden, String descripcion, double precio) {
        this.idOrden = idOrden;
        this.descripcion = descripcion;
        this.precio = precio;
    }

   
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "Orden [ID=" + idOrden + ", Descripcion=" + descripcion + ", Precio=" + precio + "]";
    }
}

