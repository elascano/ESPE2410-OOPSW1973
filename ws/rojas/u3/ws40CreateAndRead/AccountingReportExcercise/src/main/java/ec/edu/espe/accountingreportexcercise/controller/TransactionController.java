
package ec.edu.espe.accountingreportexcercise.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.accountingreportexcercise.model.Transaction;
import org.bson.Document;
import utils.MongoDBUtil;

/**
 *
 * @author Matias Rojas
 */
public class TransactionController {
    private MongoDatabase database;
    private MongoCollection<Document> transactionsCollection;

    public TransactionController() {
        database = MongoDBUtil.getDatabase();
        transactionsCollection = database.getCollection("transactions");
    }

    public void addTransaction(Transaction transaction) {
        transactionsCollection.insertOne(transaction.toDocument());
    }
}
