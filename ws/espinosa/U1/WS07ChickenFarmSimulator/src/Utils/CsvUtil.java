package Utils;

import ec.espe.edu.farmsimulator.model.Chicken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrés Espinosa
 */

public class CsvUtil {
    public static void writeChickensToCsv(String filePath, List<Chicken> chickens) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Chicken chicken : chickens) {
                writer.append(String.valueOf(chicken.getId()))
                      .append(',')
                      .append(chicken.getName())
                      .append(',')
                      .append(chicken.getColor())
                      .append(',')
                      .append(String.valueOf(chicken.getAgeInMonths()))
                      .append(',')
                      .append(chicken.getBornOnDate().toString())
                      .append(',')
                      .append(String.valueOf(chicken.isNotMolting()))
                      .append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Chicken> readChickensFromCsv(String filePath) {
        List<Chicken> chickens = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                Chicken chicken = new Chicken(
                    Integer.parseInt(attributes[0]),
                    attributes[1],
                    attributes[2],
                    new Date(attributes[4]),
                    Boolean.parseBoolean(attributes[5])
                );
                chickens.add(chicken);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chickens;
    }
}

