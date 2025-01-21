package utils;

import ec.edu.espe.galaxy.model.Galaxy;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author Alan Arias
 */
public class ByteUtil {
    public static void saveGalaxysToBytes(List<Galaxy> galaxys, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(galaxys);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Galaxy> loadGalaxysFromBytes(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Galaxy>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
