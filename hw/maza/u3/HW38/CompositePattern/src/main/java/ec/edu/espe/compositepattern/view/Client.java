package ec.edu.espe.compositepattern.view;

/**
 *
 * @author gustavo
 */
public class Client {
    public static Employee employee;

    public static void doClientTasks() {
        if (employee != null) {
            employee.stateName();
        }
    }
}
