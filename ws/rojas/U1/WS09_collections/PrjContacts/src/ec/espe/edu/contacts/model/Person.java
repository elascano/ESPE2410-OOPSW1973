
package ec.espe.edu.contacts.model;

/**
 *
 * @author USUARIO
 */

public class Person {
    private int id;
    private String name;
    private String lastName;
    private float salary;

    public Person(int id, String name, String lastName, float salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', lastName='" + lastName + "', salary=" + salary + "}";
    }
}
