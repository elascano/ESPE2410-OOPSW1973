package ec.espe.edu.StoreS.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import ec.espe.edu.StoreS.view.FrmSearchShoe;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import utils.MongoDbManager;

/**
 *
 * @author abner
 */
public class ShoeController {

    public void loadShoesFromDatabase() {
        List<Document> shoes = MongoDbManager.getAll("Shoe");

        for (Document shoe : shoes) {
            int id = shoe.getInteger("id");
            String name = shoe.getString("name");
            float price = shoe.getDouble("price").floatValue();

        }
    }

   

    
    
    public static Document findShoeById(int id) {
    try {
        MongoCollection<Document> collection = MongoDbManager.getDatabase().getCollection("Shoe");

        Document shoe = collection.find(Filters.eq("id", id)).first();

        if (shoe != null) {
            System.out.println("Shoe found: " + shoe.toJson());
        } else {
            System.out.println("No shoe found with ID: " + id);
        }

        return shoe;
    } catch (Exception e) {
        System.err.println("Error finding shoe: " + e.getMessage());
        return null;
    }
}


}