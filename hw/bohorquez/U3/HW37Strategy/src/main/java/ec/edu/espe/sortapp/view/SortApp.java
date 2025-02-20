package ec.edu.espe.sortapp.view;
import ec.edu.espe.sortapp.controller.SortingController;
/**
 *
 * @author Camila Bohorquez
 */
public class SortApp {
        private final SortingController controller;
        
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
        int data[] = {2,7,4,8,5,56,43,5,9,12};
        SortApp view = new SortApp();
        view.displaySortedData(data);
    }
    
    

    

    
}