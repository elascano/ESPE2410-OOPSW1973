package ec.edu.espe.interestrate.controller;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import utils.MongoDbManager;

/**
 *
 * @author Alexander Maza
 */

public class InvestmentController {

    private static final double INTEREST_RATE = 7.6;  // Fixed interest rate

    // Method to calculate the gain
    public double calculateGain(double amount, int time) {
        // Formula to calculate gain based on compound interest (simplified)
        return amount * (Math.pow(1 + INTEREST_RATE / 100, time) - 1);
    }

    // Method to save the investment to the database
    public void saveInvestment(double amount, int time) {
        // Calculate the gain using the formula
        double gain = calculateGain(amount, time);

        // Calculate the total (amount + gain)
        double total = amount + gain;

        // Save the data to MongoDB
        saveToDatabase(amount, time, gain, total);
    }

    // Method to save data to MongoDB
    private void saveToDatabase(double amount, int time, double gain, double total) {
        try {
            // Get the MongoDB collection
            MongoCollection<Document> collection = MongoDbManager.getDatabase().getCollection("investment");

            // Create a document with the investment data
            Document doc = new Document("amount", amount)
                    .append("time", time)
                    .append("interestRate", INTEREST_RATE)
                    .append("gain", gain)
                    .append("total", total);

            // Insert the document into the collection
            collection.insertOne(doc);
        } catch (Exception ex) {
            ex.printStackTrace();
            // Optionally log the error or handle it as needed
        }
    }
}

