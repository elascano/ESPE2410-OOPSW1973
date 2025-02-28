

package ec.edu.espe.mongocrud;

/**
 *
 * @author Robinson Bonilla <jabasteam>
 */
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
public class MongoDBConnection {
 public static void main(String[] args) {
        try {
            // Reemplaza con tu cadena de conexión
            String uri = "mongodb+srv://rchapigo:clave12345@cluster0.0etpp.mongodb.net/";
            
            // Conexión a MongoDB Atlas
            MongoClient mongoClient = MongoClients.create(uri);
            
            // Acceder a la base de datos (cambia 'test' por el nombre de tu base de datos)
            MongoDatabase database = mongoClient.getDatabase("test"); // Cambia "test" por el nombre de tu base de datos
            
            // Hacer algo con la base de datos (ejemplo: ver las colecciones)
            for (String name : database.listCollectionNames()) {
                System.out.println(name);
            }
            
            // Cerrar la conexión
            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}