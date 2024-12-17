package utils;

import ec.edu.espe.cable.model.Cable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class ObjectFileManager {

   public static <T> void insert(T object, String fileName, Class<T> type) {
    ArrayList<T> objectsList = new ArrayList<>();
    objectsList = readFromFile(fileName, type);
    objectsList.add(object);

    try (FileOutputStream fileOut = new FileOutputStream(fileName);
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        for (T obj : objectsList) {
            out.writeObject(obj);
        }
        System.out.println("The object was saved successfully.");
    } catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    }
}


    public static <T> ArrayList<T> readFromFile(String filePath, Class<T> type) {
        ArrayList<T> objects = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            while (true) {
                try {
                    T object = (T) objectInputStream.readObject();
                    objects.add(object);
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException | IOException e) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error while opening the file: " + e.getMessage());
        }

        return objects;
    }
}
