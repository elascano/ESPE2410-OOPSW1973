import ec.edu.espe.model.Camera;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class CameraUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Camera camera = null;
        
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\n--- Camera Management ---");
            System.out.println("1. Enter Camera Details");
            System.out.println("2. Show Camera Details");
            System.out.println("3. Update Camera Details");
            System.out.println("4. Check if Camera is Portable");
            System.out.println("5. Save Camera");
            System.out.println("6. Load Camera");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1:
                    camera = new Camera("", "", 0, "", 0);
                    camera.inputCameraDetails(scanner);
                    break;
                case 2:
                    if (camera != null) {
                        System.out.println(camera);
                    } else {
                        System.out.println("No camera details available.");
                    }
                    break;
                case 3:
                    if (camera != null) {
                        camera.updateCameraDetails(scanner);
                    } else {
                        System.out.println("No camera to update.");
                    }
                    break;
                case 4:
                    if (camera != null) {
                        if (camera.isPortable()) {
                            System.out.println("The camera is portable.");
                        } else {
                            System.out.println("The camera is not portable.");
                        }
                    } else {
                        System.out.println("No camera to check.");
                    }
                    break;
                case 5:
                    saveCamera(camera);
                    break;
                case 6:
                    camera = loadCamera();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        
        scanner.close();
    }

    private static void saveCamera(Camera camera) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("camera.ser"))) {
            oos.writeObject(camera);
            System.out.println("Camera details saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving camera details: " + e.getMessage());
        }
    }

    private static Camera loadCamera() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("camera.ser"))) {
            Camera camera = (Camera) ois.readObject();
            System.out.println("Camera details loaded successfully.");
            return camera;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading camera details: " + e.getMessage());
            return null;
        }
    }
}
