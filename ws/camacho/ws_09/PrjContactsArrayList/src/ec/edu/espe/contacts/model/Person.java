package ec.edu.espe.contacts.model;

/**
 *
 * @author mateo
 */
public class Person {
    private int id;
    private String name;
    private String lastNmae;
    private float salary;

    public Person(int id, String name, String lastNmae, float salary) {
        this.id = id;
        this.name = name;
        this.lastNmae = lastNmae;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", lastNmae=" + lastNmae + ", salary=" + salary + '}';
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
     * @return the lastNmae
     */
    public String getLastNmae() {
        return lastNmae;
    }

    /**
     * @param lastNmae the lastNmae to set
     */
    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
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
    
}
