package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.controller.SortingContext;

/**
 *
 * @author Dennis Paucar
 */
public class SortApp {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();
        int[] data = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3};
        context.sortArray(data);
    }
}
