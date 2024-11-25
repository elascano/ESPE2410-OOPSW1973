
package PrjProjectManagementjava;
import ec.espe.edu.pm.Database;
import ec.espe.edu.pm.Notification;
import ec.espe.edu.pm.Status;
        
/**
 * @author Brandon Pazmino
 * @version 0.1.0
 * @since 2024
 */
public class PrjProjectManagementjava {


    public static void main(String[] args) {
        System.out.println("Come on Status");
        Status status = new Status();
        System.out.println("the status is -->" + status);
       
    }   

    public static void main(String[] args) {
        System.out.println("You have a notification");
        Notification notification = new Notification();
        System.out.println("-->" + notification);
       
    }
    public static void main(String[] args) {
     Database database = new Database();
        database.username = "usuario";
        database.password = "contraseña";
        database.dataBaseName = "tu base dedatos";

        try {
            if (database.connect()) {
                System.out.println("Conexión exitosa!");
            } else {
                System.out.println("Error al conectar a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error de SQL");
        }
    }
}
