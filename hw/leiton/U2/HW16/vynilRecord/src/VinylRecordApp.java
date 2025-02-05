import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase VinylRecord que representa un vinilo
class VinylRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String artist;
    private int year;
    private double price;

    // Constructor
    public VinylRecord(String title, String artist, int year, double price) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Representación del objeto como texto
    @Override
    public String toString() {
        return "VinylRecord{" +
                "Title='" + title + '\'' +
                ", Artist='" + artist + '\'' +
                ", Year=" + year +
                ", Price=$" + price +
                '}';
    }
}

// Clase principal
public class VinylRecordApp {
    private static final String FILE_NAME = "vinylRecords.dat";
    private static List<VinylRecord> vinylRecordList = new ArrayList<>();

    public static void main(String[] args) {
        loadVinylRecords();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Vinyl Records Menu ---");
            System.out.println("1. Add Vinyl Record");
            System.out.println("2. Show all Vinyl Records");
            System.out.println("3. Save and Exit");
            System.out.print("Select an option: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Limpiar entrada
            }

            option = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (option) {
                case 1:
                    addVinylRecord(scanner);
                    break;
                case 2:
                    showVinylRecords();
                    break;
                case 3:
                    saveVinylRecords();
                    System.out.println("Data saved! Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (option != 3);

        scanner.close();
    }

    // Método para agregar un nuevo vinilo
    private static void addVinylRecord(Scanner scanner) {
        System.out.print("Enter the title of the vinyl: ");
        String title = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine();

        System.out.print("Enter the release year: ");
        int year = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Invalid input! Please enter a valid year: ");
                scanner.next();
            }
        }

        System.out.print("Enter the price: ");
        double price = 0.0;
        while (true) {
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.print("Invalid input! Please enter a valid price: ");
                scanner.next();
            }
        }

        VinylRecord record = new VinylRecord(title, artist, year, price);
        vinylRecordList.add(record);
        System.out.println("Vinyl record added successfully!");
    }

    // Mostrar todos los vinilos
    private static void showVinylRecords() {
        if (vinylRecordList.isEmpty()) {
            System.out.println("No vinyl records registered.");
        } else {
            System.out.println("\n--- Vinyl Records List ---");
            for (VinylRecord record : vinylRecordList) {
                System.out.println(record);
            }
        }
    }

    // Guardar la lista de vinilos en un archivo
    private static void saveVinylRecords() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(vinylRecordList);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Cargar la lista de vinilos desde un archivo
    @SuppressWarnings("unchecked")
    private static void loadVinylRecords() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                vinylRecordList = (List<VinylRecord>) ois.readObject();
                System.out.println("Data loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading data: " + e.getMessage());
            }
        }
    }
}

