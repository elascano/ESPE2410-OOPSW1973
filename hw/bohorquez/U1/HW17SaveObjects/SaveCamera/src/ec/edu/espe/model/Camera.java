package ec.edu.espe.model;
import java.io.Serializable;
import java.util.Scanner;

public class Camera implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String model;
    private int id;
    private String color;
    private float size;

    public Camera(String name, String model, int id, String color, float size) {
        this.name = name;
        this.model = model;
        this.id = id;
        this.color = color;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Camera{" + "name=" + name + ", model=" + model + ", id=" + id + ", color=" + color + ", size=" + size + '}';
    }

    public void inputCameraDetails(Scanner scanner) {
        System.out.print("Enter the camera's name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter the camera's model: ");
        this.model = scanner.nextLine();

        System.out.print("Enter the camera's ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the camera's color: ");
        this.color = scanner.nextLine();

        System.out.print("Enter the camera's size (in inches): ");
        this.size = scanner.nextFloat();
    }

    public boolean compareById(Camera otherCamera) {
        return this.id == otherCamera.id;
    }

    public boolean isPortable() {
        return this.size <= 5.0;
    }

    public void updateCameraDetails(Scanner scanner) {
        System.out.println("Updating camera details");
        System.out.print("Enter the new camera name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter the new camera model: ");
        this.model = scanner.nextLine();

        System.out.print("Enter the new camera color: ");
        this.color = scanner.nextLine();

        System.out.print("Enter the new camera size (in inches): ");
        this.size = scanner.nextFloat();
    }
}
