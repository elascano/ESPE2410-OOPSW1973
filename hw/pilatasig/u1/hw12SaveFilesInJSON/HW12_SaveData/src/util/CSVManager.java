
package util;

import ec.edu.ec.espe.HW12.model.Developer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author David Pilatasig
 */

public class CSVManager {
    private static final String FILE_PATH = "developers.csv";

    public void guardarEnCSV(Developer developer) {
        File file = new File(FILE_PATH);

        try (FileWriter writer = new FileWriter(file, true)) {
            
            if (file.length() == 0) {
                writer.write("Nombre,Rol,ID,AsignadoProyecto\n");
            }

            
            writer.write(developer.toCSV() + "\n");
            System.out.println("Información guardada en el archivo CSV: " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo CSV: " + e.getMessage());
        }
    }
}


