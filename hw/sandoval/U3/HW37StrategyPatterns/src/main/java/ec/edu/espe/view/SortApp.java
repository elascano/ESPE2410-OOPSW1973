package ec.edu.espe.view;

import ec.edu.espe.controller.*;
import ec.edu.espe.model.*;

/**
 *
 * @author Andres Sandoval
 */
public class SortApp {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();
        SortView view = new SortView();

        int[] array = {3,6,4,6,7,8,5,6,7,5,3,3};
        int[] arrayCopy;

        //BubbleSort
        arrayCopy = array.clone();
        context.setSortStrategy(new BubbleSort());
        context.sortArray(arrayCopy);
        view.displayArray("BubbleSort", arrayCopy);

        //QuickSort
        arrayCopy = array.clone();
        context.setSortStrategy(new QuickSort());
        context.sortArray(arrayCopy);
        view.displayArray("QuickSort", arrayCopy);

        //InsertionSort
        arrayCopy = array.clone();
        context.setSortStrategy(new InsertionSort());
        context.sortArray(arrayCopy);
        view.displayArray("InsertionSort", arrayCopy);
    }
}



