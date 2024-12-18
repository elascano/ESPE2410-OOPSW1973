package utils;

import ec.edu.espe.readandaddobjects.model.Goalkeeper;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author David Pilatasig
 */

public class GoalkeeperManager {
    private static final String FILE_NAME = "goalkeepers.dat";

    public static void writeGoalkeepers(List<Goalkeeper> newGoalkeepers) {
        List<Goalkeeper> existingGoalkeepers = readGoalkeepers();

        for (Goalkeeper newGK : newGoalkeepers) {
            if (!existingGoalkeepers.contains(newGK)) {
                existingGoalkeepers.add(newGK);
            }
        }

        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            for (Goalkeeper gk : existingGoalkeepers) {
                objectOut.writeObject(gk);
            }

            System.out.println("Goalkeepers data saved correctly on " + FILE_NAME);

        } catch (IOException e) {
            System.err.println("Error to write the file: " + e.getMessage());
        }
    }

    public static List<Goalkeeper> readGoalkeepers() {
        List<Goalkeeper> goalkeepers = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(FILE_NAME);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            while (true) {
                try {
                    Goalkeeper gk = (Goalkeeper) objectIn.readObject();
                    goalkeepers.add(gk);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. A new file will be created.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return goalkeepers;
    }
}
