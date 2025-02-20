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
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int data[] = randomNumberGenerator.generate();
        
        System.out.println("\n Original Array: " + Arrays.toString(data));
        
        SortingContext sortingContext = new SortingContext();
        int sortedList[] = sortingContext.sort(data);
        
        System.out.println(Arrays.toString(sortedList));
    }
}
