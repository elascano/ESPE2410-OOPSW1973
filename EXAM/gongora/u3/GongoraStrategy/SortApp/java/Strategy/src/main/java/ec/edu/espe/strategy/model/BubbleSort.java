package ec.edu.espe.strategy.model;

/**
 *
 * @author Lucas Gongora
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return data;
    }
}
