package ec.espe.edu.StrategySorting.view;

import ec.espe.edu.StrategySorting.controller.ChoosingSorting;
import java.util.Arrays;

/**
 *
 * @author Benjamin R
 */
public class SortApp {
    public static void main(String[] args) {
        int data[]={3,6,4,6,7,8,5,6,7,5,3,3};
        
        System.out.println(Arrays.toString(data));
        
        ChoosingSorting sc= new ChoosingSorting();
        int sortedList[]=sc.sort(data);
        
        System.out.println(Arrays.toString(sortedList));
    }
}
