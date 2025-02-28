package ec.edu.espe.strategypattern.model;

/**
 *
 * @author Gabriel Manosalvas
 */
public class SortingContext {
    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    private SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 40) {
            return new BubbleSort();
        } else if (n >= 40 && n < 100) {
            return new InsertionSort();
        } else {
            return new QuickSort();
        }
    }
}

