package ec.edu.ec.espe.HW12.model;

/**
 *
 * @author David Pilatasig
 */
public class Developer {
    private String nombre;
    private String rol;
    private int id;
    private boolean isAsignedToProject;

    // Constructor
    public Developer(String nombre, String rol, int id, boolean asignadoProyecto) {
        this.nombre = nombre;
        this.rol = rol;
        this.id = id;
        this.isAsignedToProject = asignadoProyecto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsAsignedToProject() {
        return isAsignedToProject;
    }

    public void setIsAsignedToProject(boolean isAsignedToProject) {
        this.isAsignedToProject = isAsignedToProject;
    }
    public String toCSV(){
        return String.format("%s,%s,%d,%b", nombre, rol, id, isAsignedToProject);
    }
}

