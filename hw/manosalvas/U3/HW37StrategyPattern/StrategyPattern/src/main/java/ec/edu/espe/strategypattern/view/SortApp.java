package ec.edu.espe.strategypattern.view;

import ec.edu.espe.strategypattern.model.SortingContext;

/**
 *
 * @author Gabriel Manosalvas
 */
public class SortApp {
    public static void main(String args[]) {
        int data[] = {3, 3, 6, 7, 8, 8, 6, 6, 6, 6, 4, 6, 4, 6, 6, 7, 7, 8, 5, 6, 7, 5, 3, 3, 3};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);

        System.out.print("Sorted List ----> ");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
