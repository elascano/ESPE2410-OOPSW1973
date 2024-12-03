package ec.edu.espe.farmsimulator.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.time.ZoneId;

/**
 *
 * @author Alexander Maza
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Alexander's Chicken Farm Simulator!");

        // Leer el JSON y convertirlo en objetos Chicken
        List<Chicken> chickens = loadChickensFromJson("src/chickens.json");

        // Iterar sobre las gallinas y mostrar sus datos
        for (Chicken chicken : chickens) {
            System.out.println("Chicken --> " + chicken);
            System.out.println("Chicken id --> " + chicken.getId());

            // Calcular la edad
            LocalDate bornOnDate = convertToLocalDate(chicken.getBornOnDate());
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(bornOnDate, currentDate);
            System.out.println("Chicken's age: " + age.getYears() + " years, " 
                + age.getMonths() + " months, and " + age.getDays() + " days.");
        }
    }

    // Método para leer las gallinas desde un archivo JSON
    private static List<Chicken> loadChickensFromJson(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            Type chickenListType = new TypeToken<List<Chicken>>() {}.getType();
            return gson.fromJson(reader, chickenListType);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            return null;
        }
    }

    // Método para convertir LocalDate a Date
    private static Date convertToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    // Método para convertir Date a LocalDate
    private static LocalDate convertToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
