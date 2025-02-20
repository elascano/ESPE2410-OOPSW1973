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
public class InsertionSort implements SortingStrategy {
    @Override
    public int[] sort(int data[]) {
        int n = data.length;
        int[] arr = Arrays.copyOf(data, n); // Copia del array original
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
