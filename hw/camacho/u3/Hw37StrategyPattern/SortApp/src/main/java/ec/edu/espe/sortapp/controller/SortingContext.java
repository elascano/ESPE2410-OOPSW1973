package ec.edu.espe.sortapp.controller;
/**
 *
 * @author Mateo
 */
import ec.edu.espe.sortapp.model.BubbleSort;
import ec.edu.espe.sortapp.model.InsertionSort;
import ec.edu.espe.sortapp.model.QuickSort;
import ec.edu.espe.sortapp.model.SortingStrategy;


public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int[] data) {
        int size = data.length;
        ss = setSortStrategy(size);
        ss.sort(data);
        return data;
    }
    
    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            ss = new BubbleSort();
        }
        if (n >= 30 && n < 100) {
            ss = new InsertionSort();
        }
        if (n >= 100) {
            ss = new QuickSort();
        }
        return ss;
    }
}
