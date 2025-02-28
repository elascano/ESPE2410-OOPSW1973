package ec.edu.espe.hw30uri.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import utils.MongoDBConnection;
import ec.edu.espe.hw30uri.model.Project;

/**
 *
 * @author Brandon Pazmino
 */
public class ProjectController {

    private static final String COLLECTION_NAME = "Projects";
    private static MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection(COLLECTION_NAME);

    public static Document getProject(String projectId) {
        return collection.find(eq("projectId", projectId)).first();
    }

    public static boolean addProject(Project project) {
        try {
            collection.insertOne(project.toDocument());
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar el proyecto: " + e.getMessage());
            return false;
        }
    }

    public static boolean updateProjectStatus(String projectId, String newStatus) {
        Bson filter = eq("projectId", projectId);
        Bson update = set("operationalStatus", newStatus);
        return collection.updateOne(filter, update).getModifiedCount() > 0;
    }

    public static boolean deleteProject(String projectId) {
        return collection.deleteOne(eq("projectId", projectId)).getDeletedCount() > 0;
    }

}
