
package utils;

/**
 *
 * @author USUARIO
 */
import java.time.Year;


public class Age {
public static int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();
        if (birthYear > currentYear) {
            throw new IllegalArgumentException("The birth year cannot be greater than the current year.");
        }
        return currentYear - birthYear;
    }
}
