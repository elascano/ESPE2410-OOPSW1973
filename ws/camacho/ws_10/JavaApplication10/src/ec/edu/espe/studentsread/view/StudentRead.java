package ec.edu.espe.studentsread.view;
import ec.edu.espe.studentsread.model.Student;
import ec.edu.espe.studentsread.model.Reader;
import ec.edu.espe.studentsread.model.Editor;
import ec.edu.espe.studentsread.model.Deleter;
import ec.edu.espe.studentsread.model.Searcher;
import ec.edu.espe.studentsread.util.GrabatorJson;

import java.util.List;
import java.util.Scanner;

public class StudentRead {
    private static final String FILE_PATH = "C:\\Users\\mateo\\OneDrive\\Escritorio\\students.json"; // Ruta corregida

    public static void main(String[] args) {
        List<Student> students = Reader.readJsonFile(FILE_PATH);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Leer archivo Json");
            System.out.println("2. Editar estudiante");
            System.out.println("3. Borrar estudiante");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    students.forEach(System.out::println);
                    waitForUser(scanner);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del estudiante a editar: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Student updatedStudent = new Student();
                    System.out.print("Ingrese el nuevo nombre: ");
                    updatedStudent.setName(scanner.nextLine());
                    System.out.print("Ingrese el nuevo NRC: ");
                    updatedStudent.setNrc(scanner.nextInt());
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nuevo correo electrónico: ");
                    updatedStudent.setEmail(scanner.nextLine());
                    System.out.print("Ingrese los nuevos cursos (separados por comas): ");
                    String[] courses = scanner.nextLine().split(",");
                    updatedStudent.setCourses(List.of(courses));

                    Editor.editStudent(students, editId, updatedStudent);
                    GrabatorJson.writeJsonFile(FILE_PATH, students);
                    waitForUser(scanner);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del estudiante a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Deleter.deleteStudent(students, deleteId);
                    GrabatorJson.writeJsonFile(FILE_PATH, students);
                    waitForUser(scanner);
                    break;
                case 4:
                    System.out.print("Ingrese el campo de búsqueda (name, nrc, course, id, email): ");
                    String field = scanner.nextLine();
                    System.out.print("Ingrese el término de búsqueda: ");
                    String query = scanner.nextLine();
                    List<Student> foundStudents = Searcher.searchStudentsByField(students, field, query);
                    if (foundStudents.isEmpty()) {
                        System.out.println("No se encontraron estudiantes.");
                    } else {
                        foundStudents.forEach(System.out::println);
                    }
                    waitForUser(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void waitForUser(Scanner scanner) {
        System.out.println("¿Desea regresar al menú principal? (s/n): ");
        while (!scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.println("¿Desea regresar al menú principal? (s/n): ");
        }
    }
}