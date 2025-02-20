package ec.edu.espe.hw38strategysortapp.view;

import ec.edu.espe.hw38strategysortapp.controller.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Brandon Pazmino
 */
public class SortApp {

    public static void main(String[] args) {
        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);

        System.out.println("Original array: " + Arrays.toString(data));
        System.out.println("Sorted array:   " + Arrays.toString(sortedList));

    }
}
