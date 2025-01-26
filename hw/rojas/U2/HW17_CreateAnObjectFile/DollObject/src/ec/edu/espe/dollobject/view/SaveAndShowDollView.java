
package ec.edu.espe.dollobject.view;

import ec.edu.espe.dollobject.model.Doll;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Matias Rojas
 */
public class SaveAndShowDollView {
    public static void main(String[] args) {
        String fileName = "doll.txt";
        Doll doll = new Doll("Barbie", "Pink", 101, 30.5, 19.99);
        saveObject(doll, fileName);
        Doll readDoll = readObject(fileName);

        
        if (readDoll != null) {
            System.out.println("Object read from the file:");
            System.out.println(readDoll);
       }
   }

    
    public static void saveObject(Object object, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(object);
            System.out.println("Object successfully saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving the object: " + e.getMessage());
      }
   }

   
    public static Doll readObject(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Doll) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading the object: " + e.getMessage());
            return null;
        }
    }
}