/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.view;

import ec.edu.espe.strategypattern.model.RandomNumberGenerator;
import ec.edu.espe.strategypattern.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Matias Rojas
 */
public class SortApp {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        int data[] = randomNumber.generate();      
        System.out.println("\nOriginal Array: " + Arrays.toString(data));      
        SortingContext sortingContext = new SortingContext();
        int sortedList[] = sortingContext.sort(data);      
        System.out.println(Arrays.toString(sortedList));
    }
}
