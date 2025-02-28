package ec.edu.espe.mongoinformationapp.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

import java.util.Scanner;

/**
 *
 * @author Mateo Topon
 */
public class MongoInformationApp {
    public static void main(String[] args) {
        String uri = "mongodb+srv://mtopon:mtopon@cluster0.nmg4z.mongodb.net/?retryWrites=true&w=majority";
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Conexión a la base de datos
            MongoDatabase database = mongoClient.getDatabase("oop");
            MongoCollection<Document> collection = database.getCollection("InformationApp");
            System.out.println("Conexión exitosa a la base de datos: " + database.getName());

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                // Menú interactivo
                System.out.println("\nElige una opción:");
                System.out.println("1. Crear documento");
                System.out.println("2. Leer documentos");
                System.out.println("3. Eliminar documento");
                System.out.println("4. Salir");

                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                switch (opcion) {
                    case 1:
                        crearDocumento(collection, scanner);
                        break;
                    case 2:
                        leerDocumentos(collection);
                        break;
                    case 3:
                        eliminarDocumento(collection, scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } while (opcion != 4);

        } catch (Exception e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    /**
     * Método para crear un documento en la colección.
     */
    private static void crearDocumento(MongoCollection<Document> collection, Scanner scanner) {
        System.out.println("\n--- Crear Documento ---");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese la carrera: ");
        String carrera = scanner.nextLine();

        Document nuevoEstudiante = new Document("name", nombre)
                .append("age", edad)
                .append("major", carrera);

        collection.insertOne(nuevoEstudiante);
        System.out.println("Documento creado: " + nuevoEstudiante.toJson());
    }

    /**
     * Método para leer todos los documentos de la colección.
     */
    private static void leerDocumentos(MongoCollection<Document> collection) {
        System.out.println("\n--- Leer Documentos ---");
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
    }

    /**
     * Método para eliminar un documento de la colección.
     */
    private static void eliminarDocumento(MongoCollection<Document> collection, Scanner scanner) {
        System.out.println("\n--- Eliminar Documento ---");
        System.out.print("Ingrese el nombre del estudiante a eliminar: ");
        String nombre = scanner.nextLine();

        Document filtro = new Document("name", nombre);
        DeleteResult resultado = collection.deleteOne(filtro);

        if (resultado.getDeletedCount() > 0) {
            System.out.println("Documento eliminado con éxito.");
        } else {
            System.out.println("No se encontró ningún documento con ese nombre.");
        }
    }
}

