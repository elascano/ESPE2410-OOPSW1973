
import java.io.Serializable;
/**
 *
 * @author gustavo
 */

public class Notebook implements Serializable {
    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;

    public Notebook(String marca, String modelo, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                ", almacenamiento=" + almacenamiento +
                '}';
    }
}

