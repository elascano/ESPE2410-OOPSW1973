package ec.edu.espe.sortapp.view;
/**
 *
 * @author Mateo
 */

import ec.edu.espe.sortapp.controller.SortingContext;

public class SortApp {

    public static void main(String[] args) {
    int data[] = {3, 6, 4, 6, 7, 8, 5, 7, 6, 5, 3, 3};
    SortingContext sc = new SortingContext();
    int[] sortedList = sc.sort(data);

    System.out.println("Sorted array:");
    for (int num : sortedList) {
        System.out.print(num + " ");
        }
    }
}
