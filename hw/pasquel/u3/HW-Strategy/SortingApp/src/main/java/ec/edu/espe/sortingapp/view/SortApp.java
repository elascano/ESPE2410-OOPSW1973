
package ec.edu.espe.sortingapp.view;
import ec.edu.espe.sortingapp.model.BubbleSort;
import ec.edu.espe.sortingapp.model.InsertionSort;
import ec.edu.espe.sortingapp.model.QuickSort;
import ec.edu.espe.sortingapp.model.SortingContext;
import ec.edu.espe.sortingapp.model.SortingStrategy;
import java.util.Scanner;
/**
 *
 * @author Marlon Pasquel
 */

public class SortApp {

    public static void main(String[] args) {
        SortingContext context = new SortingContext();

        if (isSorted(SortingStrategy.ARRAY)) {
            System.out.println("The array is already sorted.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("The array is not sorted. Please select the sorting algorithm:");
            System.out.println("1. BubbleSort");
            System.out.println("2. InsertionSort");
            System.out.println("3. QuickSort");
            System.out.print("Option: ");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    SortingStrategy bubbleSort = new BubbleSort();
                    context.setSortStrategy(bubbleSort);
                    double bubbleSortTime = measureExecutionTime(context);
                    System.out.println("BubbleSort execution time: " + bubbleSortTime + " seconds.");
                    break;
                case 2:
                    SortingStrategy insertionSort = new InsertionSort();
                    context.setSortStrategy(insertionSort);
                    double insertionSortTime = measureExecutionTime(context);
                    System.out.println("InsertionSort execution time: " + insertionSortTime + " seconds.");
                    break;
                case 3:
                    SortingStrategy quickSort = new QuickSort();
                    context.setSortStrategy(quickSort);
                    double quickSortTime = measureExecutionTime(context);
                    System.out.println("QuickSort execution time: " + quickSortTime + " seconds.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            scanner.close();
        }
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static double measureExecutionTime(SortingContext context) {
        long startTime = System.nanoTime();
        context.sort();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        return duration / 1_000_000_000.0;
    }
}

