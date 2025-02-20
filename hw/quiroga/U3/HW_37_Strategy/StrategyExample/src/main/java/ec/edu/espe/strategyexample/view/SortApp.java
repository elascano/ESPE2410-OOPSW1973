
package ec.edu.espe.strategyexample.view;

import ec.edu.espe.strategyexample.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Esteban Quiroga 
 */
public class SortApp {
    public static void main(String[] args) {
        
        int data[]={3,6,4,6,7,8,5,6,7,5,3,3,8,9,1,7,55,6,1,8,1,655,1,89,51,651,61,8,1,65};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        String dataString = Arrays.toString(data);
        String sortedListString = Arrays.toString(sortedList);
        
        System.out.println("This is the non sorted list -->" + dataString);
        System.out.println("This is the sorted list -->"+ sortedListString);
        System.out.println("Sorted with: "+ sc.getSs());
    }
}
