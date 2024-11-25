package utils;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 *
 * @author Klever Jami
 */
public class FileManager {

    public static void save(String data, String fileName, String format) {
        if ("csv".equalsIgnoreCase(format)) {
            saveToCSV(data, fileName + ".csv");
        } else if ("json".equalsIgnoreCase(format)) {
            saveToJSON(data, fileName + ".json");
        } else {
            System.out.println("Unsupported format: " + format);
        }
    }

    private static void saveToCSV(String data, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName); CSVPrinter printer = new CSVPrinter(fileWriter, CSVFormat.DEFAULT)) {
            printer.printRecord((Object[]) data.split(","));
            System.out.println("Data saved to CSV: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving to CSV: " + e.getMessage());
        }
    }

    private static void saveToJSON(String data, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            Gson gson = new Gson();
            fileWriter.write("{\"data\":\"" + data + "\"}");
            System.out.println("Data saved to JSON: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving to JSON: " + e.getMessage());
        }
    }
}
