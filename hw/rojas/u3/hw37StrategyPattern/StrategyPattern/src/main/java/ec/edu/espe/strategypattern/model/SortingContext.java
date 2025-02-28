/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.model;

import ec.edu.espe.strategypattern.controller.BubbleSort;
import ec.edu.espe.strategypattern.controller.InsertionSort;
import ec.edu.espe.strategypattern.controller.QuickSort;
import ec.edu.espe.strategypattern.controller.SortingStrategy;

/**
 *
 * @author Matias Rojas
 */

public class SortingContext {
    private SortingStrategy strategy;

    public int[] sort(int data[]){
        int size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }

    private SortingStrategy setSortStrategy(int size) {
        if(size > 0 && size < 30){
            System.out.print("Using BubbleSort Strategy: ");
            strategy = new BubbleSort();
        }
        
        if(size >= 30 && size < 100){
            System.out.print("Using InsertionSort Strategy: ");
            strategy = new InsertionSort();
        }
        
        if(size >= 100){
            System.out.print("Using QuickSort Strategy: ");
            strategy = new QuickSort();
        }
        
        return strategy;
    }
}
