
/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
    import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    
public class EmployeeBirthday {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Gson gson = new Gson();

       
        while (true) {
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Birthdate (YYYY-MM-DD): ");
            String birthdate = scanner.nextLine();

           
            Employee employee = new Employee(name, birthdate);
            employees.add(employee);

            System.out.print("Do you want to add another employee? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

       
        try (FileWriter writer = new FileWriter("employees.json")) {
            gson.toJson(employees, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        
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

class Employee {
    private String name;
    private String birthdate;
    private int age;

    public Employee(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.age = computeAge(birthdate);
    }

    
    private int computeAge(String birthdate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthdate, formatter);
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthDate.getYear() - (currentDate.getDayOfYear() < birthDate.getDayOfYear() ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', birthdate='" + birthdate + "', age=" + age + '}';
    }
}


