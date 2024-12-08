package ec.edu.espe.contacts.model;

/**
 *
 * @author Sebastian Charij
 */
public class Person {

    private int id;
    private String name;
    private String LastName;
    private float salary;

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", LastName=" + LastName + ", salary=" + salary + '}';
    }

    public Person(int id, String name, String LastName, float salary) {
        this.id = id;
        this.name = name;
        this.LastName = LastName;
        this.salary = salary;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
