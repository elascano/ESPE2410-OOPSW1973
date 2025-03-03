
package utils;

/**
 *
 * @author USUARIO
 */
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
private static final String URI = "mongodb+srv://daullcu:daullcu@cluster0.dxj9m.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "your_database_name";

    public static MongoDatabase getDatabase() {
        MongoClient client = MongoClients.create(URI);
        return client.getDatabase(DATABASE_NAME);
    }
}
