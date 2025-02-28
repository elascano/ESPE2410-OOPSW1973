
package ec.edu.espe.sortapp.model;

/**
 *
 * @author Alan Arias
 */
public class SortingContext {
    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    private SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n <= 30)
            return new BubbleSort();
        if (n > 30 && n < 100)
            return new InsertionSort();
        return new QuickSort();
    }
}