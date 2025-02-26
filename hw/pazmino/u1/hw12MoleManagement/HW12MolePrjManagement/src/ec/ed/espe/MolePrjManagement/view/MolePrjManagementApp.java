package ec.ed.espe.MolePrjManagement.view;

import ec.ed.espe.MolePrjManagement.model.Customer;
import ec.ed.espe.MolePrjManagement.model.JsonFileManager;
import ec.ed.espe.MolePrjManagement.model.Notification;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brandon Pazmino
 */
public class MolePrjManagementApp {
     public static void main(String[] args) {
      
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("1", "Pepe", "pepe@.com", "1234567890", "0987654321"));
        customers.add(new Customer("2", "Maria", "maria@.com", "0987654321", "1234567890"));

       
        JsonFileManager.saveCustomersToJson(customers, "customers.json");

  
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification(1, "Tarea signada", "enviar", "Tienes notificaciones pendientes"));
        notifications.add(new Notification(2, "Recordatorio de fecha límite", "pendiente", "No olvides tu próxima fecha límite"));

       
        JsonFileManager.saveNotificationsToJson(notifications, "notifications.json");
    }
    
}
