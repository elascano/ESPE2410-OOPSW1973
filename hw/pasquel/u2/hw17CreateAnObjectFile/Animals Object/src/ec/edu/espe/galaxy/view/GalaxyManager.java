package ec.edu.espe.galaxy.view;

import ec.edu.espe.galaxy.model.Galaxy;
import utils.ByteUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Alan Arias
 */

public class GalaxyManager {
    private List<Galaxy> galaxys;
    private static final String FILENAME = "galaxys.dat";
    
    public GalaxyManager() {
        galaxys = new ArrayList<>();
    }
    
    public void addGalaxy(Galaxy galaxy) {
        galaxys.add(galaxy);
        ByteUtil.saveGalaxysToBytes(galaxys, FILENAME); 
        System.out.println("Galaxy added and saved successfully!");
    }
    public void readGalaxy() {
    try {
        List<Galaxy> loadedGalaxys = ByteUtil.loadGalaxysFromBytes(FILENAME);
        if (loadedGalaxys != null) {
        galaxys = loadedGalaxys;
        System.out.println("\nLoaded Galaxys");
        System.out.println("------------------");
            
            for (Galaxy galaxy : galaxys) {
                System.out.println("ID: " + galaxy.getId());
                System.out.println("name: " + galaxy.getName());
                System.out.println("type: " + galaxy.getType());
                System.out.println("number of stars: " + galaxy.getNumberOfStars());
                System.out.println("------------------");
            }
            
            System.out.println("\nGalaxy loaded successfully!!");
        } else {
            System.out.println("No saved galaxies were found or the file is empty.");
        }
        
    } catch (Exception e) {
        System.err.println("Error loading galaxies: " + e.getMessage());
        }
    }
    public static void showMenuOptions() {
        GalaxyManager manager = new GalaxyManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new galaxy");
            System.out.println("2. Load galaxy");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Alan's Save Galaxy Simulator ");
                System.out.println("Enter the Data of the Galaxy");
                System.out.println("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("name: ");
                String name = scanner.nextLine();

                System.out.println("type (spiral, elliptical, irregular): ");
                String type = scanner.nextLine();

                System.out.println("number of stars: ");
                int numberOfStars = scanner.nextInt();
                scanner.nextLine();
                Galaxy galaxy = new Galaxy(id, name, type, numberOfStars);
                manager.addGalaxy(galaxy);

            } else if (choice == 2) {
                manager.readGalaxy();
            }else if (choice == 3){
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
