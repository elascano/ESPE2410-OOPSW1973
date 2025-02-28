/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.model;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matias Rojas
 */

public class RandomNumberGenerator {
    Random random = new Random();
    
    public int[] generate(){
        Scanner insertSize = new Scanner(System.in);
        Scanner insertRange = new Scanner(System.in);
        int size;
        int range;
        
        
        System.out.print("Data amount: ");
        size = insertSize.nextInt();
        
        
        System.out.print("Range number: ");
        range = insertRange.nextInt();
        
        
        int data[] = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(range+1);
        }
        
        return data;
    }
}
