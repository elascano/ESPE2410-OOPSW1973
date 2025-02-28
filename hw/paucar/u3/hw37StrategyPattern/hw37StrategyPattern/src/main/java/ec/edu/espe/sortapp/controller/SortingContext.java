package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.BubbleSort;
import ec.edu.espe.sortapp.model.InsertionSort;
import ec.edu.espe.sortapp.model.QuickSort;
import ec.edu.espe.sortapp.model.SortingStrategy;

/**
 *
 * @author Dennis Paucar
 */
public class SortingContext {
    private SortingStrategy strategy;
    private String strategyName;

    public void setSortStrategy(int[] array) {
        if (array.length < 30) {
            this.strategy = new BubbleSort();
            this.strategyName = "Bubble Sort";
        } else if (array.length < 100) {
            this.strategy = new InsertionSort();
            this.strategyName = "Insertion Sort";
        } else {
            this.strategy = new QuickSort();
            this.strategyName = "Quick Sort";
        }
    }

    public void sortArray(int[] array) {
        System.out.println("Unsorted array: " + java.util.Arrays.toString(array));
        setSortStrategy(array); 
        if (strategy != null) {
            strategy.sort(array);
            System.out.println("Sorted array: " + java.util.Arrays.toString(array));
            System.out.println("Sorting strategy used: " + strategyName);
        } else {
            System.out.println("No sorting strategy set.");
        }
    }
}
