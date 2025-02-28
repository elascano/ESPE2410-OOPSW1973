/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;


public class mgl_conexion {
 
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    
    private mgl_conexion() {}
    
    public static MongoDatabase getConexion() {
        if (mongoClient == null) {
            
            String uri = "mongodb+srv://0000mama:0000mama@cluster0.0nmcc.mongodb.net/";

            MongoClientURI clientUri = new MongoClientURI(uri);
            mongoClient = new MongoClient(clientUri);

            database = mongoClient.getDatabase("estudiantes"); 
        }
        
        return database;
    }
    

    public static void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            database = null;
        }
    }
    
}
