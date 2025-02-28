package ec.edu.espe.compositePattern.view;
import ec.edu.espe.compositePattern.model.Employee;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila Bohorquez
 */
public class EmployeeView {
public void printEmployeeDetails(Employee employee) {
        StringBuilder sb = new StringBuilder();
        employee.stateName(sb);
        JOptionPane.showMessageDialog(null, sb.toString(), "Organization", JOptionPane.INFORMATION_MESSAGE);
    }
}