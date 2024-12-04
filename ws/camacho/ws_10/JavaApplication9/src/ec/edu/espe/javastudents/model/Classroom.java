package ec.edu.espe.javastudents.model;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Classroom {
    int nrc;
    ArrayList<Student> students;

    public Classroom(int nrc) {
        this.nrc = nrc;
        this.students = new ArrayList<>();
    }

    // Método de agregar al estudiante
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Los estudiantes del nrc " + nrc + " son:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Getter y setter del NRC
    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

