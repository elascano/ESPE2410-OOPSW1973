
package ec.edu.espe.sortingapp.model;

/**
 *
 * @author Marlon Pasquel
 */
public class InsertionSort implements SortingStrategy {
    @Override
    public void sort() {
        System.out.println("Sorting using Insertion Sort");
        int[] array = SortingStrategy.ARRAY.clone(); 
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }
}
