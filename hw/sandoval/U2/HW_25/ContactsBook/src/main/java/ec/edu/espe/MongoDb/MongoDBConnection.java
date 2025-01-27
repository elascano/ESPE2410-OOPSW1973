package ec.edu.espe.MongoDb;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USER
 */
public class MongoDBConnection {
    private static final String CONNECTION_STRING = "mongodb+srv://aesandoval:aesandoval@cluster0.5z3gp.mongodb.net/";
    private static final String DATABASE_NAME = "YOURBASADATE";
    private static final String COLLECTION_NAME = "Contacts";

    public static MongoDatabase getDatabase() {
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new com.mongodb.ConnectionString(CONNECTION_STRING))
                .build();
        return MongoClients.create(settings).getDatabase(DATABASE_NAME);
    }

    public static MongoCollection<Document> getCollection() {
        return getDatabase().getCollection(COLLECTION_NAME);
    }
    

public class DataRetriever {
    public List<Document> getData() {
        MongoDatabase database = MongoDBConnection.getDatabase();
        MongoCollection<Document> collection = database.getCollection("NombreDeTuColección");
        List<Document> dataList = new ArrayList<>();
        for (Document doc : collection.find()) {
            dataList.add(doc);
        }
        return dataList;
    }
}

}

