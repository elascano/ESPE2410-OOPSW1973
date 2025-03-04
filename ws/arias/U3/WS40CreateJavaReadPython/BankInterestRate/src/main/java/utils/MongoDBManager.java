package utils;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author Alan Arias
 */


public class MongoDBManager {
    private static final String URI = "mongodb+srv://ajarias:ajarias@cluster0.8efem.mongodb.net/?retryWrites=true&w=majority";

    public void connect() {
        try {
            MongoClient client = MongoClients.create(URI);
            MongoDatabase database = client.getDatabase("BankDB");

            System.out.println("Successfully connected to MongoDB");

            Document user = new Document("name", "User")
                    .append("capital", 1000)
                    .append("interestRate", 5)
                    .append("time", 1);

            database.getCollection("users").insertOne(user);

        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
}