package ec.edu.espe.studentsread.model;
import ec.edu.espe.studentsread.model.Student;
import java.util.List;



public class Editor {
    public static void editStudent(List<Student> students, int id, Student updatedStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setNrc(updatedStudent.getNrc());
                student.setEmail(updatedStudent.getEmail());
                student.setCourses(updatedStudent.getCourses());
                break;
            }
        }
    }
}