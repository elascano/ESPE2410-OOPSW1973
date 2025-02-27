package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.BubbleSort;
import ec.edu.espe.sortapp.model.InsertionSort;
import ec.edu.espe.sortapp.model.QuickSort;
import ec.edu.espe.sortapp.model.SortingStrategy;

/**
 *
 * @author David Cuichan
 */
public class SortingContext {
    private SortingStrategy strategy;

    public int[] sort(int data[]){
        int size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }

    private SortingStrategy setSortStrategy(int size) {
        if(size > 0 && size < 30){
            System.out.print("Using BubbleSort Strategy: ");
            strategy = new BubbleSort();
        }
        
        if(size >= 30 && size < 100){
            System.out.print("Using InsertionSort Strategy: ");
            strategy = new InsertionSort();
        }
        
        if(size >= 100){
            System.out.print("Using QuickSort Strategy: ");
            strategy = new QuickSort();
        }
        
        return strategy;
    }
}
