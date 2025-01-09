package ec.edu.espe.hwmongosearchjava;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HWMongoSearchJavaApp {

    public static void main(String[] args) {
      
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        Connection connection = new Connection();
        MongoClient mongoClient = null;

        try {
            mongoClient = connection.createConnection(); 
            MongoDatabase database = mongoClient.getDatabase("OOP");
            MongoCollection<Document> collection = database.getCollection("STUDENTS");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el ID del estudiante: ");
            String studentIdToSearch = scanner.nextLine();

            Document student = findStudentById(collection, studentIdToSearch);

            if (student != null) {
                System.out.println("Estudiante encontrado: " + student.toJson());
            } else {
                System.out.println("Estudiante con ID " + studentIdToSearch + " no encontrado.");
            }

            System.out.println("\nListado de todos los estudiantes (limitado a 10):");
            listAllStudents(collection);

        } catch (Exception e) {
            System.err.println("Error en la aplicación: " + e.getMessage());
            e.printStackTrace(); 
        } finally {
            if (mongoClient != null) {
                mongoClient.close();
            }
        }
    }

    private static Document findStudentById(MongoCollection<Document> collection, String studentId) {
        FindIterable<Document> result = collection.find(Filters.eq("id", studentId));
        return result.first();
    }

    private static void listAllStudents(MongoCollection<Document> collection) {
        FindIterable<Document> result = collection.find().limit(10);
        for (Document student : result) {
            System.out.println(student.toJson());
        }
    }
}