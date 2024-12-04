package ec.edu.espe.studentsread.model;
import ec.edu.espe.studentsread.model.Student;
import java.util.Iterator;
import java.util.List;

public class Deleter {
    public static void deleteStudent(List<Student> students, int id) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}
