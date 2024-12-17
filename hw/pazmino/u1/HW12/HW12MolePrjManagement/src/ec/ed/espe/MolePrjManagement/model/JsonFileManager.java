package ec.ed.espe.MolePrjManagement.model;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import ec.ed.espe.MolePrjManagement.model.Customer;
import ec.ed.espe.MolePrjManagement.model.Notification;
/**
 *
 * @author Brandon Pazmino
 */
public class JsonFileManager {

    public static void saveCustomersToJson(List<Customer> customers, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(customers, writer);
            System.out.println("Clientes guardados en: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al guardar en JSON: " + e.getMessage());
        }
    }

    // Método para guardar una lista de objetos Notification en JSON
    public static void saveNotificationsToJson(List<Notification> notifications, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(notifications, writer);
            System.out.println("Notificaciones guardadas en: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al guardar en JSON: " + e.getMessage());
        }
    }

    
}
