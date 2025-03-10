package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author abner
 */
public class ConnectMongoDB {

    private static MongoClient client;
    private static MongoDatabase db;
    private static MongoCollection<Document> collection;

    public static void connectToDatabase() {
        client = MongoClients.create("mongodb+srv://afproanio:afproanio@cluster0.luxrh.mongodb.net/");
        db = client.getDatabase("VolumeCalculator");
        collection = db.getCollection("Volume");

    }

    public static void saveData(String id, String length, String width, String high) {
        connectToDatabase();
        try {
            Document volume = new Document("ID", Integer.parseInt(id))
                    .append("Long", Float.parseFloat(length))
                    .append("Width", Float.parseFloat(width))
                    .append("High", Float.parseFloat(high));

            collection.insertOne(volume);
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos inválidos. Verifique los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void deleteData(String id) {
        connectToDatabase();
        try {

            int idDelete = Integer.parseInt(id);
            Document result = collection.findOneAndDelete(new Document("ID", idDelete));

            if (result != null) {
                JOptionPane.showMessageDialog(null, "Datos eliminados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún documento con ese ID.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void searchData(String id) {
        connectToDatabase();
        try {
            int idSearch = Integer.parseInt(id);
            Document foundDocument = collection.find(new Document("ID", idSearch)).first();

            if (foundDocument != null) {
                StringBuilder message = new StringBuilder();
                message.append("ID: ").append(foundDocument.getInteger("ID")).append("\n")
                        .append("Longitud: ").append(foundDocument.getDouble("Long")).append("\n")
                        .append("Ancho: ").append(foundDocument.getDouble("Width")).append("\n")
                        .append("Alto: ").append(foundDocument.getDouble("High")).append("\n");

                JOptionPane.showMessageDialog(null, message.toString(), "Datos Encontrados", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún documento con ese ID.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
