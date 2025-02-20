
package ec.edu.espe.strategyexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int[] sortedData = data.clone();
        int n = sortedData.length;
        for (int i = 1; i < n; i++) {
            int key = sortedData[i];
            int j = i - 1;
            while (j >= 0 && sortedData[j] > key) {
                sortedData[j + 1] = sortedData[j];
                j--;
            }
            sortedData[j + 1] = key;
        }
        return sortedData;
    }
    
}
