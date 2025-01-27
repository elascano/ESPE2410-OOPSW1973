package controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import model.Student;
import org.bson.Document;
import utils.MongoDBManager;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private MongoDBManager mongoDBManager;
    private MongoCollection<Document> studentCollection;

    public StudentController() {
        mongoDBManager = new MongoDBManager();
        studentCollection = mongoDBManager.getCollection("STUDENTS");
    }

    public void addStudent(Student student) {
        Document document = new Document("id", student.getId())
                .append("name", student.getName())
                .append("signature", student.getSignature())
                .append("career", student.getCareer());
        studentCollection.insertOne(document);
    }

    public List<Student> readStudents() {
        List<Student> students = new ArrayList<>();
        MongoCursor<Document> cursor = studentCollection.find().iterator();

        while (cursor.hasNext()) {
            Document doc = cursor.next();
            Student student = new Student(
                    doc.getString("id"),
                    doc.getString("name"),
                    doc.getString("signature"),
                    doc.getString("career")
            );
            students.add(student);
        }
        return students;
    }

    public void updateStudent(String id, String updatedStudent, String signature, String career) {
        Document query = new Document("id", id);
        Document updatedDocument = new Document("$set", new Document("name", updatedStudent.getName())
                .append("signature", updatedStudent.getSignature())
                .append("career", updatedStudent.getCareer()));
        studentCollection.updateOne(query, updatedDocument);
    }

    public void deleteStudent(String id) {
        Document query = new Document("id", id);
        studentCollection.deleteOne(query);
    }
}
