package com.mycompany.strategyexample.view;

import com.mycompany.strategyexample.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author David Pilatasig
 */
public class SortApp {
    public static void main(String[] args) {
        int data[]={3,6,4,6,7,8,5,6,7,5,3,3};
        
        System.out.println(Arrays.toString(data));
        
        SortingContext sc= new SortingContext();
        int sortedList[]=sc.sort(data);
        
        System.out.println(Arrays.toString(sortedList));
    }
}
