
import com.ejemplo.estudiantes.controller.EstudianteController;
import com.ejemplo.estudiantes.model.Estudiante;
import com.ejemplo.estudiantes.view.EstudianteView;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class App {
    public static void main(String[] args) {
        EstudianteView view = new EstudianteView();
        EstudianteController controller = new EstudianteController(view);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n --- GESTION DE ESTUDIANTES ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Listar estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarEstudiante(scanner, controller);
                    break;
                case 2:
                    buscarEstudiante(scanner, controller);
                    break;
                case 3:
                    modificarEstudiante(scanner, controller);
                    break;
                case 4:
                    eliminarEstudiante(scanner, controller);
                    break;
                case 5:
                    controller.listarEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void agregarEstudiante(Scanner scanner, EstudianteController controller) {
        System.out.println("\n --- AGREGAR ESTUDIANTE ---");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        controller.agregarEstudiante(new Estudiante(0, nombre, correo, edad)); // id será asignado en el controlador
    }

    private static void buscarEstudiante(Scanner scanner, EstudianteController controller) {
        System.out.println("\n --- BUSCAR ESTUDIANTE ---");
        System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        controller.buscarEstudiante(id);
    }

    private static void modificarEstudiante(Scanner scanner, EstudianteController controller) {
        System.out.println("\n --- MODIFICAR ESTUDIANTE ---");
        System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese la nueva edad: ");
        int edad = scanner.nextInt();

        controller.modificarEstudiante(id, nombre, correo, edad);
    }

    private static void eliminarEstudiante(Scanner scanner, EstudianteController controller) {
        System.out.println("\n --- ELIMINAR ESTUDIANTE ---");
        System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        controller.eliminarEstudiante(id);
    }
}