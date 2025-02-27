/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypatter.controller;

import ec.edu.espe.strategypatter.model.BubbleSort;
import ec.edu.espe.strategypatter.model.InsertionSort;
import ec.edu.espe.strategypatter.model.QuickSort;
import ec.edu.espe.strategypatter.model.SortingStrategy;

/**
 *
 * @author Lisbeth Tipan
 */
public class SortingContext {
    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length; 
        ss = setSortStrategy(size);
        return ss.sort(data);
    }


    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
               System.out.println(" BubbleSort");
        return new BubbleSort();
    } else if (n >= 30 && n < 100) {
        System.out.println(" InsertionSort");
        return new InsertionSort();
    } else {
        System.out.println(" QuickSort");
        return new QuickSort();
    }
}
}
