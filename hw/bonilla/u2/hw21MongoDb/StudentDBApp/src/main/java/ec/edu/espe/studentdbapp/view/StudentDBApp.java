package ec.edu.espe.studentdbapp.view;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import utils.ManageStudent;
import org.bson.Document;

import java.util.List;
import java.util.Scanner;

public class StudentDBApp {

    public static void main(String[] args) {
        try {
            String uri = "mongodb+srv://rchapigo:clave12345@cluster0.0etpp.mongodb.net/";
            
            MongoClient mongoClient = MongoClients.create(uri);
            
            MongoDatabase database = mongoClient.getDatabase("studentsDB");
            
            database.runCommand(new Document("ping", 1));
            System.out.println("Successfully connected to MongoDB Atlas!");

            ManageStudent manageStudent = new ManageStudent(database, "students");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        addStudent(scanner, manageStudent);
                        break;
                    case "2":
                        viewStudents(manageStudent);
                        break;
                    case "3":
                        updateStudent(scanner, manageStudent);
                        break;
                    case "4":
                        deleteStudent(scanner, manageStudent);
                        break;
                    case "5":
                        System.out.println("Exiting the program.");
                        mongoClient.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB Atlas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void addStudent(Scanner scanner, ManageStudent manageStudent) {
        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Student Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            manageStudent.addStudent(id, name, gpa, age);
            System.out.println("Student added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values for GPA and age.");
        } catch (Exception e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    private static void viewStudents(ManageStudent manageStudent) {
        try {
            List<Document> students = manageStudent.viewStudents();
            if (students.isEmpty()) {
                System.out.println("\nNo students found in the database.");
                return;
            }
            System.out.println("\n--- List of Students ---");
            for (Document student : students) {
                System.out.println(student.toJson());
            }
        } catch (Exception e) {
            System.out.println("Error viewing students: " + e.getMessage());
        }
    }

    private static void updateStudent(Scanner scanner, ManageStudent manageStudent) {
        try {
            System.out.print("Enter the ID of the student to update: ");
            String id = scanner.nextLine();
            System.out.print("Enter the new name of the student: ");
            String name = scanner.nextLine();
            System.out.print("Enter the new GPA of the student: ");
            double gpa = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the new age of the student: ");
            int age = Integer.parseInt(scanner.nextLine());

            manageStudent.updateStudent(id, name, gpa, age);
            System.out.println("Student updated successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values for GPA and age.");
        } catch (Exception e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    private static void deleteStudent(Scanner scanner, ManageStudent manageStudent) {
        try {
            System.out.print("Enter the ID of the student to delete: ");
            String id = scanner.nextLine();
            manageStudent.deleteStudent(id);
            System.out.println("Student deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}