
package ec.edu.espe.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.model.Person;
import org.bson.Document;
import utils.MongoDBConnection;
/**
 *
 * @author USUARIO
 */
public class PersonController {
 private MongoCollection<Document> collection;

 public PersonController() {
        MongoDatabase database = MongoDBConnection.getDatabase();
        this.collection = database.getCollection("people");
    }
  public void savePerson(String name, int birthYear) {
        Person person = new Person(name, birthYear);
        collection.insertOne(person.toDocument());
        System.out.println("Person saved successfully in MongoDB.");
    }

}
