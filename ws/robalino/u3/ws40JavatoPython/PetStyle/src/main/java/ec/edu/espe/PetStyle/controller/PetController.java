package ec.edu.espe.PetStyle.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.PetStyle.model.Pet;
import org.bson.Document;
import utils.MongoDbManager;

/**
 *
 * @author Benjamin
 */
public class PetController {
    

   

    public static boolean insertPet(Pet pet) {
        try {
            MongoCollection<Document> collection = MongoDbManager.getDatabase().getCollection("Pet");
            Document petDocument = new Document("name", pet.getName())
                    .append("breed", pet.getBreed())
                    .append("age", pet.getAge())
                    .append("weight", pet.getWeight());
            collection.insertOne(petDocument);
            System.out.println("Pet inserted");
            return true;
        } catch (Exception e) {
            System.err.println("Error inserting pet: " + e.getMessage());
            return false;
        }
    }

    
        }
    
    
   



