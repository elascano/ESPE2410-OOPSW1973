
package getemployeesage;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class employeesAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Gson gson = new Gson();

        // Input employee data
        while (true) {
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Birthdate (YYYY-MM-DD): ");
            String birthdate = scanner.nextLine();

            // Create Employee object and compute age
            Employee employee = new Employee(name, birthdate);
            employees.add(employee);

            System.out.print("Do you want to add another employee? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Save employee data to JSON file
        try (FileWriter writer = new FileWriter("employees.json")) {
            gson.toJson(employees, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Read and display employee data from the JSON file
        try (FileReader reader = new FileReader("employees.json")) {
            Employee[] loadedEmployees = gson.fromJson(reader, Employee[].class);
            for (Employee employee : loadedEmployees) {
                System.out.println(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


