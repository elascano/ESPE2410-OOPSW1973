package ec.edu.espe.hw38strategysortapp.model;

/**
 *
 * @author Brandon Pazmino
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        System.out.println("Using InsertionSort...");
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        return data;
    }
}
