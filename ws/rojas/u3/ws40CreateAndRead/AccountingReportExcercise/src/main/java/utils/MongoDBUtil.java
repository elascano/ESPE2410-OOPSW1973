
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Matias Rojas
 */

public class MongoDBUtil {
    private static final String URI = "mongodb+srv://projas:projas@cluster0.ul8fh.mongodb.net/";  
    private static final String DATABASE_NAME = "financeDB";  

    public static MongoDatabase getDatabase() {
        MongoClient mongoClient = MongoClients.create(URI);
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}
    
