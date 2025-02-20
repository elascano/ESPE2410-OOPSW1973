
package ec.edu.espe.strategyexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int[] sortedData = data.clone(); // Avoid modifying original array
        int n = sortedData.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedData[j] > sortedData[j + 1]) {
                    // Swap
                    int temp = sortedData[j];
                    sortedData[j] = sortedData[j + 1];
                    sortedData[j + 1] = temp;
                }
            }
        }
        return sortedData;
    }
    
}
