
package ec.edu.espe.sortapp.view;
import ec.edu.espe.sortapp.controller.SortingController;

/**
 *
 * @author Alan Arias
 */


public class SortApp {
        private SortingController controller;
        
        public SortApp() {
        controller = new SortingController();
        }
        
        public void displaySortedData(int[] data) {
        int[] sortedData = controller.sortData(data);
        System.out.print("Sorted Data: ");
        for (int num : sortedData) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int data[] = {3, 6, 4, 6, 7, 8, 5, 7, 5, 3, 3};
        SortApp view = new SortApp();
        view.displaySortedData(data);
    }
    
    

    

    
}