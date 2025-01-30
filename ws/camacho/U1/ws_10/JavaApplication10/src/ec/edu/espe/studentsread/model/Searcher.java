package ec.edu.espe.studentsread.model;
import java.util.List;
import java.util.stream.Collectors;

public class Searcher {
    public static List<Student> searchStudentsByField(List<Student> students, String field, String query) {
        switch (field.toLowerCase()) {
            case "name":
                return students.stream()
                        .filter(student -> student.getName().equalsIgnoreCase(query))
                        .collect(Collectors.toList());
            case "nrc":
                return students.stream()
                        .filter(student -> Integer.toString(student.getNrc()).equals(query))
                        .collect(Collectors.toList());
            case "course":
                return students.stream()
                        .filter(student -> student.getCourses().stream().anyMatch(course -> course.equalsIgnoreCase(query)))
                        .collect(Collectors.toList());
            case "id":
                return students.stream()
                        .filter(student -> Integer.toString(student.getId()).equals(query))
                        .collect(Collectors.toList());
            case "email":
                return students.stream()
                        .filter(student -> student.getEmail().equalsIgnoreCase(query))
                        .collect(Collectors.toList());
            default:
                return List.of(); // Retorna una lista vacía si el campo no es válido
        }
    }
}
