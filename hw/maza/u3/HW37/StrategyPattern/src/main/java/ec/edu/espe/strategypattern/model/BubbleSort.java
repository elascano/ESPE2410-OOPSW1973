package ec.edu.espe.strategypattern.model;

/**
 *
 * @author Alexander Maza
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int data[]) {
        int n = data.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }
}
