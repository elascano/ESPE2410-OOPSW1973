
package ec.edu.espe.sortingapp.model;

/**
 *
 * @author Marlon Pasquel
 */

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort() {
        System.out.println("Sorting using Bubble Sort");
        int[] array = SortingStrategy.ARRAY.clone(); 
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }
}

