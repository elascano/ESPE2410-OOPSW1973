package utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import ec.edu.espe.pibapp.model.CountryGDP;
import org.bson.Document;

/**
 *
 * @author Brandon Pazmino
 */
public class MongoDBConnection {
 public static MongoClient createConnection() {
        String connectionString = "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(connectionString);
        return mongoClient;
    }
    
    public MongoCollection<Document> connect() {
        MongoDatabase database = createConnection().getDatabase("OOP");
        return database.getCollection("PIB");
    }

    public static boolean add(CountryGDP countryGDP) {
        MongoDBConnection mongoDBConnection = new MongoDBConnection();
        MongoCollection<Document> collection = mongoDBConnection.connect();
        boolean saved = false;

        try {
            Document doc = new Document("countryName", countryGDP.getCountryName())
                    .append("gdpPerCapita", countryGDP.getGdpPerCapita());

            collection.insertOne(doc);
            saved = true;
        } catch (Exception ex) {
            System.out.println("Error al guardar el PIB per cápita: " + ex.getMessage());
            saved = false;
        }

        return saved;
    }

    public static double calculateDifference(CountryGDP countryGDP1, CountryGDP countryGDP2) {
        return Math.abs(countryGDP1.getGdpPerCapita() - countryGDP2.getGdpPerCapita());
    }
}
