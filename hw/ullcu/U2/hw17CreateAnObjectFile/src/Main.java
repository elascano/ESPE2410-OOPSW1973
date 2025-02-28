
/**
 *
 * @author Alexander Ullco
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "soccerballs.dat"; 
        List<SoccerBall> soccerBalls = new ArrayList<>();

        
        soccerBalls.add(new SoccerBall(1, "Nike", 25.99, "leather"));
        soccerBalls.add(new SoccerBall(2, "Adidas", 29.99, "leather"));
        soccerBalls.add(new SoccerBall(3, "Puma", 19.99, "rubber"));

        // Serializar (guardar en binario)
        saveAsBinaryFile(soccerBalls, fileName);

        // Deserializar (leer del archivo binario)
        List<SoccerBall> loadedSoccerBalls = loadFromBinaryFile(fileName);

        
        System.out.println("Objects loaded from binary file:");
        for (SoccerBall ball : loadedSoccerBalls) {
            System.out.println(ball);
        }
    }

    // Método para serializar objetos en formato binario
    private static void saveAsBinaryFile(List<SoccerBall> soccerBalls, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(soccerBalls);
            System.out.println("Objects saved successfully in binary file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving binary file: " + e.getMessage());
        }
    }

    // Método para deserializar objetos desde el archivo binario
    private static List<SoccerBall> loadFromBinaryFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<SoccerBall>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading binary file: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}
    