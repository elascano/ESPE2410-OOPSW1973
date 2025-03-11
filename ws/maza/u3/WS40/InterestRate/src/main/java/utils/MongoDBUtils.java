
package utils;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author gustavo
 */
public class MongoDBUtils {
    private static final String CONNECTION_STRING = "mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "Investment";
    
    public static MongoDatabase getDatabase() {
        var mongoClient = MongoClients.create(CONNECTION_STRING);
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}
