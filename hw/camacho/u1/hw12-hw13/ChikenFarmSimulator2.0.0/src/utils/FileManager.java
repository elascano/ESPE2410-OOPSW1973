package utils;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Mateo Camacho
 */
public class FileManager {
    public static void save(String data, String fileName, String format){
        String fullFileName = fileName + "." + format;
        
        try (FileWriter fileWriter = new FileWriter(fullFileName)){
            fileWriter.write(data);
            System.out.println("Data save to" + fullFileName);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("An error ocurred while saving the file");
        } 
    }
    
   public static void saveToCsv(String fileName, String[] headers, String[] values) {
    String fullFileName = fileName + ".csv";

    try (FileWriter fileWriter = new FileWriter(fullFileName, true)) {
        // Si el archivo está vacío, escribe los encabezados
        if (fullFileName.length() == 0) {
            fileWriter.append(String.join(",", headers));
            fileWriter.append("\n");
        }
        
        fileWriter.append(String.join(",", values));
        fileWriter.append("\n");

        System.out.println("Data saved to " + fullFileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while saving the CSV file");
           }
    }
}


