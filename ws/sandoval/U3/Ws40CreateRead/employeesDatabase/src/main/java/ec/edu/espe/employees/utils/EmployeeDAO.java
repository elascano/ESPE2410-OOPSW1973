package ec.edu.espe.employees.utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.employees.model.Employee;
import org.bson.Document;


/**
 *
 * @author Andres Sandoval
 */

public class EmployeeDAO {
    private final MongoCollection<Document> collection;

    public EmployeeDAO() {
        this.collection = MongoDBConnection.getDatabase().getCollection("employees");
    }

    public void save(Employee employee) {
        Document doc = new Document("name", employee.getName())
                        .append("email", employee.getEmail())
                        .append("salary", employee.getSalary());
        collection.insertOne(doc);
    }
}
