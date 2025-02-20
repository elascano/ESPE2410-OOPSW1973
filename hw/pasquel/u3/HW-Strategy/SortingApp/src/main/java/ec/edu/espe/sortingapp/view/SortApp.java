
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the sorting algorithm:");
        System.out.println("1. BubbleSort");
        System.out.println("2. InsertionSort");
        System.out.println("3. QuickSort");
        System.out.print("Option: ");
        
        int option = scanner.nextInt();
        long startTime, endTime, duration;

        switch (option) {
            case 1:
                SortingStrategy bubbleSort = new BubbleSort();
                context.setSortStrategy(bubbleSort);
                startTime = System.nanoTime();
                context.sort();
                endTime = System.nanoTime();
                duration = endTime - startTime;
                double seconds = duration / 1_000_000_000.0;
                System.out.println("Execution time: " + seconds + " seconds.");
                break;
            case 2:
                SortingStrategy insertionSort = new InsertionSort();
                context.setSortStrategy(insertionSort);
                startTime = System.nanoTime();
                context.sort();
                endTime = System.nanoTime();
                duration = endTime - startTime;
                seconds = duration / 1_000_000_000.0;
                System.out.println("Execution time: " + seconds + " seconds.");
                break;
            case 3:
                SortingStrategy quickSort = new QuickSort();
                context.setSortStrategy(quickSort);
                startTime = System.nanoTime();
                context.sort();
                endTime = System.nanoTime();
                duration = endTime - startTime;
                seconds = duration / 1_000_000_000.0;
                System.out.println("Execution time: " + seconds + " seconds.");
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
