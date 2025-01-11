package ec.edu.espe.studentsmongo.model;

import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Lucas Gongora
 */

public class Menu {
    private Scanner scanner;
    private CRUDMongo database;
    private boolean executionMenu;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.executionMenu = true;
        this.database = new CRUDMongo("mongodb+srv://lngongora:lngongora@cluster0.y73d4.mongodb.net/", "OOP");
    }

    public void initialize() {
        try {
            database.connectDB();
        } catch (Exception e) {
            System.err.println("Failed to initialize database connection.");
            System.exit(1);
        }
    }

    public String input(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public void run() {
        initialize();
        do {
            showOptions();
            String option = input("Enter the option: ");
            processOption(option);
        } while (executionMenu);

        scanner.close();
    }

    public void showOptions() {
        System.out.println("Students Menu");
        System.out.println("1. Add student");
        System.out.println("2. View all students");
        System.out.println("3. Update student");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
    }

    public void processOption(String option) {
        switch (option) {
            case "1":
                addStudent();
                break;
            case "2":
                viewAllStudents();
                break;
            case "3":
                updateStudent();
                break;
            case "4":
                deleteStudent();
                break;
            case "5":
                executionMenu = false;
                database.closeConnection();
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option, please try again.");
                break;
        }
    }

    public void addStudent() {
        String id = input("Enter the id: ");
        String name = input("Enter the name: ");
        double pga = Double.parseDouble(input("Enter the PGA: "));
        int age = Integer.parseInt(input("Enter the age in years: "));

        // Create JSON-like document structure
        Document json = new Document()
                .append("id", id)
                .append("name", name)
                .append("PGA", pga)
                .append("ageInYears", age);

        database.insertData("students", json);
    }

    public void viewAllStudents() {
        database.findData("students", new Document());
    }

    public void updateStudent() {
        String id = input("Enter the id of the student you want to update: ");
        Document query = new Document("id", id);
        database.findData("students", query);

        String name = input("Enter the new name: ");
        double pga = Double.parseDouble(input("Enter the new PGA: "));
        int age = Integer.parseInt(input("Enter the new age: "));

        Document updateDoc = new Document()
                .append("name", name)
                .append("PGA", pga)
                .append("ageInYears", age);

        database.updateData("students", query, updateDoc);
    }

    public void deleteStudent() {
        String id = input("Enter the id of the student you want to delete: ");
        Document query = new Document("id", id);
        database.findData("students", query);
        database.deleteData("students", query);
    }

    
}
