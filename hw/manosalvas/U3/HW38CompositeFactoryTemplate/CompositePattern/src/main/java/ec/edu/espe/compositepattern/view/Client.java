package ec.edu.espe.compositepattern.view;

/**
 *
 * @author Gabriel Manosalvas
 */
public class Client {
    public static Employee employee;

    public static void doClientTasks() {
        if (employee != null) {
            employee.stateName();
        }
    }
}
