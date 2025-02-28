/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypatter.model;

import java.util.Arrays;

/**
 *
 * @author Lisbeth Tipan
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
         int n = data.length;
        int[] arr = Arrays.copyOf(data, n); // Copia del array original
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                 
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    }
    

