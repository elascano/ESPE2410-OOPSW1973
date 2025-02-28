package ec.edu.espe.mole.view;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.mole.controller.ProjectController;
import ec.edu.espe.mole.model.Customer;
import ec.edu.espe.mole.model.JSONFileHandler;
import ec.edu.espe.mole.model.Project;
import ec.edu.espe.mole.model.Status;
import java.lang.reflect.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Marlon Pasquel
 */

public class ProjectMenu {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static void createProjectMenu(ProjectController controller, Scanner scanner) {
        
        String projectId;
        String description;
        
        System.out.println("\n--- Create project ---");

        System.out.print("Introduce project Id: ");
        projectId = scanner.nextLine().trim();
        while(projectId.isEmpty()) {
            System.out.println("Error: The ID of the project can not be empty.");
            projectId= scanner.nextLine().trim();
        }

        System.out.print("Enter the project description: ");
        description = scanner.nextLine().trim();
        while(description.isEmpty()) {
            System.out.println("Error: La descripcion del proyecto no puede estar vacia. Error: The description can not be empty");
            description=scanner.nextLine().trim();
        }

        System.out.print("Enter client ID: ");
        String customerId = scanner.nextLine().trim();

        System.out.print("Enter client name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter email client: ");
        String customerEmail = scanner.nextLine().trim();

        System.out.print("Enter RUC client: ");
        String customerRUC = scanner.nextLine().trim();

        System.out.print("Enter the customer s phone number: ");
        String customerPhone = scanner.nextLine().trim();

        Customer customer = new Customer(customerId, customerName, customerEmail, customerRUC, customerPhone);

        System.out.print("Enter the project start date (YYYY-MM-DD): ");
        String startDateStr = scanner.nextLine().trim();
        Date startDate = parseDate(startDateStr);
        while(startDate == null) {
            System.out.println("Error: Invalid date format.");
            startDateStr = scanner.nextLine().trim();
            startDate = parseDate(startDateStr);
        }

        System.out.println("Choose the project status:");
        for (int i = 0; i < Status.values().length; i++) {
            System.out.println((i + 1) + ". " + Status.values()[i]);
        }
        int statusOption = scanner.nextInt();
        scanner.nextLine(); 
        while(statusOption < 1 || statusOption > Status.values().length) {
            System.out.println("Error: Invalid option.");
            statusOption=scanner.nextInt();
            scanner.nextLine();
        }
        Status status = Status.values()[statusOption - 1];
        
        Project project= new Project(projectId, description, customer, startDate, status);
        
        controller.createProject(project);

    }

    public static void updateProjectStatusMenu(ProjectController controller, Scanner scanner) {
        System.out.println("\n--- Update project status ---");

    JSONFileHandler<Project> handler = new JSONFileHandler<>();
    List<Project> projectList = new ArrayList<>();
    String filepath = "project.json";
    Type projectListType = new TypeToken<List<Project>>() {}.getType();
    projectList = handler.readFromFile(filepath, projectListType);

    boolean wasfounded = false;

    System.out.print("Enter the project ID:");
    String projectId = scanner.nextLine().trim();
    if (projectId.isEmpty()) {
        System.out.println("Error: Project ID cannot be empty.");
        return;
    }

    for (Project project : projectList) {
        if (project.getProjectId().equals(projectId)) {
            System.out.print("Change project description:");
            String description = scanner.nextLine();
            project.setDescription(description);

            System.out.println("Change project status:");
            for (int i = 0; i < Status.values().length; i++) {
                System.out.println((i + 1) + ". " + Status.values()[i].getDescription());
            }

            int statusOption = -1;
            do {
                try {
                    System.out.print("Seleccione el nuevo estado (1-" + Status.values().length + "): ");
                    statusOption = scanner.nextInt();
                    scanner.nextLine();
                    if (statusOption < 1 || statusOption > Status.values().length) {
                        System.out.println("Error: Invalid option. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: You must enter an integer.");
                    scanner.nextLine(); 
                }
            } while (statusOption < 1 || statusOption > Status.values().length);

            Status status = Status.values()[statusOption - 1];
            project.setStatus(status);
            wasfounded = true;

            System.out.println("The project status has been changed to:" + status.getDescription());
            break; 
        }
    }

    if (!wasfounded) {
        System.out.println("Your project does not exist.");
    } else {
        handler.writeToFile(projectList, "project.json");
        System.out.println("The changes have been saved successfully.");
    }
        }

    private static Date parseDate(String dateStr) {
        try {
            return DATE_FORMAT.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }
}
