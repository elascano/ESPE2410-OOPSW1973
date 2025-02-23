package ec.edu.espe.javastudents.model;

/**
 *
 * @author mateo
 */
public class Student {
    private int id;
    private String name;
    private String lastname;
    private String email;
    private int nrc; // Nuevo atributo NRC

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastname=" 
                + lastname + ", email=" + email + ", nrc=" + nrc + '}';
    }

    public Student(int id, String name, String lastname, String email, int nrc) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.nrc = nrc;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }
}