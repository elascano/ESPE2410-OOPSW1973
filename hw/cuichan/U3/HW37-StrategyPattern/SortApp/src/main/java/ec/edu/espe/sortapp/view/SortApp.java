package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.controller.RandomNumberGenerator;
import ec.edu.espe.sortapp.controller.SortingContext;
import java.util.Arrays;

/**
 *
 * @author David Cuichan
 */
public class SortApp {

    public static void main(String[] args) {
        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        int data[] = randomNumber.generate();
        
        System.out.println("\nOriginal Array: " + Arrays.toString(data));
        
        SortingContext sortingContext = new SortingContext();
        int sortedList[] = sortingContext.sort(data);
        
        System.out.println(Arrays.toString(sortedList));
    }
}
