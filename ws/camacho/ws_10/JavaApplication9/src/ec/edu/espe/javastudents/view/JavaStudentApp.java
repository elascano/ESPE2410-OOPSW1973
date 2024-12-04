package ec.edu.espe.javastudents.view;

import ec.edu.espe.javastudents.model.Classroom;
import ec.edu.espe.javastudents.model.Student;
import ec.edu.espe.javastudents.controller.ManageFileJson;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Classroom> classrooms = new ArrayList<>();

        // Creación de tres Classroom con diferentes NRCs
        classrooms.add(new Classroom(101));
        classrooms.add(new Classroom(102));
        classrooms.add(new Classroom(103));

        boolean continuar = true;

        while (continuar) {
            // Mostrar menú para ingresar un nuevo estudiante
            System.out.println("Ingrese los datos del estudiante:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Nombre: ");
            String name = scanner.nextLine();

            System.out.print("Apellido: ");
            String lastname = scanner.nextLine();

            System.out.print("Correo: ");
            String email = scanner.nextLine();

            // Mostrar los NRC disponibles
            System.out.println("Seleccione el NRC donde desea registrar al estudiante:");
            for (int i = 0; i < classrooms.size(); i++) {
                System.out.println((i + 1) + ". NRC " + classrooms.get(i).getNrc());
            }

            System.out.print("Seleccione el NRC (1, 2, 3): ");
            int nrcSeleccionado = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (nrcSeleccionado >= 1 && nrcSeleccionado <= classrooms.size()) {
                // Crear el objeto Student
                Student student = new Student(id, name, lastname, email, classrooms.get(nrcSeleccionado - 1).getNrc());

                // Agregar el estudiante al NRC seleccionado
                classrooms.get(nrcSeleccionado - 1).addStudent(student);
            } else {
                System.out.println("Opción no válida.");
            }

            // Preguntar si desea agregar otro estudiante
            System.out.print("¿Desea agregar otro estudiante? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        // Guardar los datos en un archivo JSON
        ManageFileJson.saveClassroomsToFile(classrooms, "classrooms.json");

        // Preguntar si desea revisar la lista de estudiantes
        System.out.println("¿Desea revisar la lista de estudiantes? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Seleccione el NRC para revisar la lista de estudiantes:");
            for (int i = 0; i < classrooms.size(); i++) {
                System.out.println((i + 1) + ". NRC " + classrooms.get(i).getNrc());
            }

            System.out.print("Seleccione el NRC (1, 2, 3): ");
            int nrcSeleccionado = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (nrcSeleccionado) {
                case 1:
                    classrooms.get(0).showStudents();
                    break;
                case 2:
                    classrooms.get(1).showStudents();
                    break;
                case 3:
                    classrooms.get(2).showStudents();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}
