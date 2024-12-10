package tenantdata;

/**
 *
 * @author Alexander Maza
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TenantData {

    public static void main(String[] args) {
        // Crear una lista de apartamentos
        List<CondoApp> apartamentos = Arrays.asList(
            new CondoApp(101, "Juan Perez", 3, true),
            new CondoApp(102, "Maria Gomez", 2, false),
            new CondoApp(103, "Carlos Ruiz", 4, true)
        );

        // Imprimir los apartamentos en consola de manera ordenada
        imprimirApartamentosEnConsola(apartamentos);

        // Guardar los datos en un archivo JSON
        guardarComoJson(apartamentos, "apartamentos.json");

        // Guardar los datos en un archivo CSV
        guardarComoCsv(apartamentos, "apartamentos.csv");
    }

    // Método para imprimir los apartamentos de forma ordenada en consola
    public static void imprimirApartamentosEnConsola(List<CondoApp> apartamentos) {
        // Encabezado para la tabla
        System.out.println("ID_Apartamento | Inquilino     | Num_Habitaciones | Ocupado");
        System.out.println("------------------------------------------------------------");

        // Imprimir cada apartamento usando su método toString
        for (CondoApp apt : apartamentos) {
            System.out.println(apt);
        }
    }

    // Método para guardar los datos como JSON
    public static void guardarComoJson(List<CondoApp> apartamentos, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write("[\n");

            // Escribir cada apartamento en formato JSON
            for (CondoApp apt : apartamentos) {
                writer.write(String.format("  { \"id_apartamento\": %d, \"inquilino\": \"%s\", \"num_habitaciones\": %d, \"ocupado\": %b },\n",
                        apt.getIdApartamento(), apt.getInquilino(), apt.getNumHabitaciones(), apt.isOcupado()));
            }

            writer.write("]");
            System.out.println("Datos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar los datos como CSV
    public static void guardarComoCsv(List<CondoApp> apartamentos, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write("ID_Apartamento,Inquilino,Num_Habitaciones,Ocupado\n");

            // Escribir cada apartamento en formato CSV
            for (CondoApp apt : apartamentos) {
                writer.write(String.format("%d,%s,%d,%b\n", apt.getIdApartamento(), apt.getInquilino(), apt.getNumHabitaciones(), apt.isOcupado()));
            }

            System.out.println("Datos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
