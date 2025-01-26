package ec.edu.espe.mongodb.mongodbapp;

/**
 *
 * @author Matias Rojas
 */
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class MongoDbApp {

    public static void main(String[] args) {
        String uri = "mongodb+srv://projas:projas@cluster0.ul8fh.mongodb.net/"; 
        try (MongoClient mongoClient = new MongoClient(new MongoClientURI(uri))) {
            MongoDatabase database = mongoClient.getDatabase("homework");
            MongoCollection<Document> collection = database.getCollection("users");

            Scanner scanner = new Scanner(System.in);

            System.out.println("|||||||||Programa para guardar datos en MongoDB||||||||||");

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Ingrese su ciudad: ");
            String ciudad = scanner.nextLine();
            Document document = new Document("nombre", nombre)
                    .append("edad", edad)
                    .append("ciudad", ciudad);

            collection.insertOne(document);
            System.out.println("Datos guardados exitosamente en la base de datos.");

        } catch (Exception e) {
            System.err.println("Error al conectar con MongoDB: " + e.getMessage());
        }
    }
}
