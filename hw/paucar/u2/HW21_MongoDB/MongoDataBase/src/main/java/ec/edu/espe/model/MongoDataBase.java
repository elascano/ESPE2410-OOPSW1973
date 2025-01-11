package ec.edu.espe.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Dennis Paucar
 */
public class MongoDataBase {
    static String connectionString = "mongodb+srv://dspaucar:dspaucar@cluster0.lx1js.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    
    public static void insertarAutomovil() {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ID del automovil: ");
        String id = scanner.nextLine();

        System.out.print("Introduce la marca del automovil: ");
        String marca = scanner.nextLine();

        System.out.print("Introduce el modelo del automovil: ");
        String modelo = scanner.nextLine();

        System.out.print("Introduce el precio del automovil: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Introduce el color del automovil: ");
        String color = scanner.nextLine();

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            MongoCollection<Document> collection = database.getCollection("cars");

            Document document = new Document("id", id)
                    .append("marca", marca)
                    .append("modelo", modelo)
                    .append("precio", precio)
                    .append("color", color);

           
            collection.insertOne(document);

            System.out.println("Automovil insertado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al conectar con MongoDB: " + e.getMessage());
        }
    }

    
    public static void mostrarAutomoviles() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            MongoCollection<Document> collection = database.getCollection("cars");

            System.out.println("\nAutomoviles guardados en la base de datos:");

          
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error al conectar con MongoDB: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int opcion;
        do {
            
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Insertar automovil");
            System.out.println("2. Mostrar todos los automoviles");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

           
            scanner.nextLine();

            
            switch (opcion) {
                case 1:
                    insertarAutomovil();
                    break;
                case 2:
                    mostrarAutomoviles();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor ingrese una opcion valida.");
            }
        } while (opcion != 0);


        scanner.close();
    }
}



