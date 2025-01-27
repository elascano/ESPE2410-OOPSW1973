/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mongodbclothesapp;

import java.util.Scanner;

/**
 *
 * @author Mateo Topon
 */
public class MongoDBClothesApp {

    public static void main(String[] args) {
 String connectionString = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/"; 
        String databaseName = "clothingStore";

        MyMongoDatabase db = new MyMongoDatabase(connectionString, databaseName);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Clothing Item Entry ===");
        System.out.print("Enter the clothing item ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Enter the clothing item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the clothing item price: ");
        double price = scanner.nextDouble();

       
        db.insertClothingItem(id, name, price);
    }
}

