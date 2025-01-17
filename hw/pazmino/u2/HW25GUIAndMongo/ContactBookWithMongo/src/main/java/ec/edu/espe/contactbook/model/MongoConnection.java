package ec.edu.espe.contactbook.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author Brandon Pazmino
 */
public class MongoConnection {

    public MongoClient createConnection() {
        String connectionString = "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/"; 
        
        MongoClient mongoClient = MongoClients.create(connectionString);
        return mongoClient;
    }
}
