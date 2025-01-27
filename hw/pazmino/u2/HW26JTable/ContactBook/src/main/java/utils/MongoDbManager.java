package utils;
import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Brandon Pazmino
 */

public class MongoDbManager {
    private static final String CONNECTION_STRING = "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "CONTACTSBOOK"; 
    private static MongoClient mongoClient = null;

    public static void connect() {
        try {
            mongoClient = MongoClients.create(CONNECTION_STRING);
            System.out.println("Successful connection to MongoDB");
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }

    public static boolean add(Object object) {
        if (mongoClient == null) {
            connect();  // Asegúrate de estar conectado
        }

        boolean saved = false;
        String collectionName = object.getClass().getSimpleName(); // Usa el nombre de la clase como nombre de la colección

        try {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Convertir el objeto a JSON usando Gson
            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document document = Document.parse(json);

            // Asegurémonos de que el documento no esté vacío
            if (document.isEmpty()) {
                System.out.println("The document is empty and cannot be inserted.");
                return false;
            }

            // Insertar el objeto en la colección
            collection.insertOne(document);
            System.out.println("Object saved in the collection: " + collectionName);
            saved = true;

        } catch (Exception e) {
            // Agregar más detalles a la excepción para depuración
            System.err.println("Error saving object: " + e.getMessage());
            e.printStackTrace(); // Esto proporcionará más detalles sobre el error
        }

        return saved;
    }
    
    public static List<Object[]> loadAllData(String collectionName, String[] columnNames) {
        if (mongoClient == null) {
            connect();
        }

        List<Object[]> dataList = new ArrayList<>();
        try {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Obtener todos los documentos de la colección
            for (Document doc : collection.find()) {
                Object[] rowData = new Object[columnNames.length];
                for (int i = 0; i < columnNames.length; i++) {
                    rowData[i] = doc.get(columnNames[i]); // Asumimos que los documentos tienen los campos correspondientes
                }
                dataList.add(rowData);
            }

            // Mostrar cuántas filas se cargaron
            System.out.println("Data loaded: " + dataList.size() + " rows");

        } catch (Exception e) {
            System.err.println("Error loading data from MongoDB: " + e.getMessage());
        }

        return dataList;
    }
}


