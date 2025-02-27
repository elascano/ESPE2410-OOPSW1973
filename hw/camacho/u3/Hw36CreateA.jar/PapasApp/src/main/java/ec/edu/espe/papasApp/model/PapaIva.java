package ec.edu.espe.papasApp.model;
import java.util.Scanner;
/**
 *
 * @author mateo
 */

// Clase Singleton para calcular el IVA de las papas
class PapaIva {
    private static PapaIva instance;
    private static final double IVA_RATE = 0.15;
    private static final double PRECIO_POR_KG = 1.50;

    private PapaIva() {}

    public static PapaIva getInstance() {
        if (instance == null) {
            instance = new PapaIva();
        }
        return instance;
    }

    public double calcularIva(double pesoKg) {
        double precioTotal = pesoKg * PRECIO_POR_KG;
        return precioTotal * IVA_RATE;
    }
}


