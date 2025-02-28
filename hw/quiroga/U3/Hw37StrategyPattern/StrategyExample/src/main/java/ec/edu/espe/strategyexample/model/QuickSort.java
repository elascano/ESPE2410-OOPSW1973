
package ec.edu.espe.strategyexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int[] sortedData = data.clone(); // Avoid modifying the original array
        quickSortHelper(sortedData, 0, sortedData.length - 1);
        return sortedData;
    }
    
    private static void quickSortHelper(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);
            quickSortHelper(data, low, pivotIndex - 1);
            quickSortHelper(data, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                // Swap
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        // Swap pivot to correct position
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }
}
