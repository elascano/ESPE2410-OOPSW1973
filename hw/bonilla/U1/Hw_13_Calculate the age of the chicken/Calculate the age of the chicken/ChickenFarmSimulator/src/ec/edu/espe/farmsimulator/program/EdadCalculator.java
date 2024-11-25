
package ec.edu.espe.farmsimulator.program;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Robinson Bonilla
 */
public class EdadCalculator {
        
    // Método que calcula la edad en años
    public int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();  // Devuelve solo los años
    }
}
