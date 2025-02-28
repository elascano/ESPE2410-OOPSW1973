

package getemployeesage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Employee {

    private String name;
    private String birthdate;
    private int age;

    public Employee(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.age = computeAge(birthdate);
    }

    // Method to compute age
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

