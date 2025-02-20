package ec.edu.espe.hw38strategysortapp.model;

/**
 *
 * @author Brandon Pazmino
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        System.out.println("Using QuickSort...");
        quickSort(data, 0, data.length - 1);
        return data;

    }
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
