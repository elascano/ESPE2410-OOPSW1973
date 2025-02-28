/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mongodbclothesapp;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class MyMongoDatabase {
    private final MongoDatabase database;

    public MyMongoDatabase(String connectionString, String databaseName) {
        MongoClient mongoClient = MongoClients.create(connectionString);
        this.database = mongoClient.getDatabase(databaseName);
    }

public void insertClothingItem(int id, String name, double price) {
    MongoCollection<Document> collection = database.getCollection("clothes");
    Document clothingItem = new Document("_Id", id)
            .append("Name", name)
            .append("Price", price);
    collection.insertOne(clothingItem);
    System.out.println("Clothing item successfully saved to MongoDB.");
}
}

