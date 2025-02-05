import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Microphone implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String brand;
    private double price;

    public Microphone(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Microphone{" + "name=" + name + ", brand=" + brand + ", price=" + price + '}';
    }




public class PjrMicrophoneApp {
    private static final String FILE_NAME = "microphones.dat";
    private static List<Microphone> microphoneList = new ArrayList<>();

    public static void main(String[] args) {
        loadMicrophones(); 
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add microphone");
            System.out.println("2. Show all microphones");
            System.out.println("3. Save and exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); 
            switch (option) {
                case 1:
                    addMicrophone(scanner);
                    break;
                case 2:
                    showMicrophones();
                    break;
                case 3:
                    saveMicrophones();
                    System.out.println("Data Saved!");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 3);

        scanner.close();
    }


    private static void addMicrophone(Scanner scanner) {
        System.out.print("Enter the microphone name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the microphone brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the microphone price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Microphone microphone = new Microphone(name, brand, price);
        microphoneList.add(microphone);
        System.out.println("Microphone Added!");
    }


    private static void showMicrophones() {
        if (microphoneList.isEmpty()) {
            System.out.println("No microphone registred.");
        } else {
            System.out.println("\n--- Microphones List ---");
            for (Microphone mic : microphoneList) {
                System.out.println(mic);
            }
        }
    }

 
    private static void saveMicrophones() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(microphoneList);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    private static void loadMicrophones() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                microphoneList = (List<Microphone>) ois.readObject();
                System.out.println("Data loaded succesfully.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error saving data: " + e.getMessage());
            }
        }
    }
}
}