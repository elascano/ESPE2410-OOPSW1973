package ec.edu.espe.employees.view;

/**
 *
 * @author Andres Sandoval
 */

import java.util.Scanner;

public class EmployeeView {
    private Scanner scanner;

    public EmployeeView() {
        this.scanner = new Scanner(System.in);
    }

    public String getEmployeeName() {
        System.out.println("Enter employee name:");
        return scanner.nextLine();
    }

    public String getEmployeeEmail() {
        System.out.println("Enter employee email:");
        return scanner.nextLine();
    }

    public double getEmployeeSalary() {
        System.out.println("Enter employee salary:");
        return scanner.nextDouble();
    }
}

