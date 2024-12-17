package ec.edu.espe.phoneapp.view;

import ec.edu.espe.phoneapp.model.Phone;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Andrés Espinosa
 */

public class PhoneApp {
    public static void main(String[] args) {
        // Create a Phone object
        Phone phone1 = new Phone(1, "Galaxy S21", "Samsung", 799.99f);

        // Save the object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("phone.ser"))) {
            out.writeObject(phone1);
            System.out.println("Object saved to phone.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("phone.ser"))) {
            Phone storedPhone = (Phone) in.readObject();
            System.out.println("Object read from phone.ser: " + storedPhone);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
