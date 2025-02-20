package com.mycompany.strategyexample.model;

import com.mycompany.strategyexample.controller.BubbleSort;
import com.mycompany.strategyexample.controller.InsertionSort;
import com.mycompany.strategyexample.controller.QuickSort;
import com.mycompany.strategyexample.controller.SortingStrategy;

/**
 *
 * @author David Pilatasig
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size= data.length;
        ss=setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int size){
        int n=size;
        if (n>0 && n<30){
            ss=new BubbleSort();
            System.out.println("Using Bubble sort");
        }
        else if(n>=30 && n<100){
            ss= new InsertionSort();
            System.out.println("Using Insertion sort");
        }
            
        else{
            ss=new QuickSort();
            System.out.println("Using Quick sort");
        }  
        return ss;
    }    
}
