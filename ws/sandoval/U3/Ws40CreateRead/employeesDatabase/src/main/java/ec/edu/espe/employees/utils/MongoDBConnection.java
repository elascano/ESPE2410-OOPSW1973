package ec.edu.espe.employees.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.employees.model.Employee;
import org.bson.Document;

/**
 *
 * @author Andres Sandoval
 */

public class MongoDBConnection {
    private static final String CONNECTION_STRING = "mongodb+srv://aesandoval:aesandoval@cluster0.5z3gp.mongodb.net/";
    private static final String DATABASE_NAME = "employeesDatabase";
    private static MongoClient mongoClient = MongoClients.create(CONNECTION_STRING);
    private static MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);

    public static MongoDatabase getDatabase() {
        return database;
    }

    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}


