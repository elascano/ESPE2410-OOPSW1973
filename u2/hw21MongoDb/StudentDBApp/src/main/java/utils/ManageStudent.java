package utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import static com.mongodb.client.model.Filters.eq;

public class ManageStudent {
    private final MongoCollection<Document> collection;

    public ManageStudent(MongoDatabase database, String collectionName) {
        this.collection = database.getCollection(collectionName);
    }

    public void addStudent(String id, String name, double gpa, int age) {
        try {
            Document existingStudent = collection.find(eq("id", id)).first();
            if (existingStudent != null) {
                throw new RuntimeException("A student with ID " + id + " already exists.");
            }

            Document student = new Document("id", id)
                    .append("name", name)
                    .append("GPA", gpa)
                    .append("ageInYears", age);
            collection.insertOne(student);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add student: " + e.getMessage(), e);
        }
    }

    public List<Document> viewStudents() {
        try {
            return collection.find().into(new ArrayList<>());
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve students: " + e.getMessage(), e);
        }
    }

    public void updateStudent(String id, String name, double gpa, int age) {
        try {
            Document filter = new Document("id", id);
            Document update = new Document("$set", new Document("name", name)
                    .append("GPA", gpa)
                    .append("ageInYears", age));
            
            UpdateResult result = collection.updateOne(filter, update);
            if (result.getMatchedCount() == 0) {
                throw new RuntimeException("No student found with ID " + id);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to update student: " + e.getMessage(), e);
        }
    }

    public void deleteStudent(String id) {
        try {
            Document filter = new Document("id", id);
            DeleteResult result = collection.deleteOne(filter);
            if (result.getDeletedCount() == 0) {
                throw new RuntimeException("No student found with ID " + id);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to delete student: " + e.getMessage(), e);
        }
    }
}