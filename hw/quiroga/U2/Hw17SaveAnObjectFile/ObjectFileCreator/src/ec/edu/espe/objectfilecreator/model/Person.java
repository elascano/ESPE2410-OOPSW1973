
package ec.edu.espe.objectfilecreator.model;

import java.io.Serializable;

/**
 *
 * @author Esteban Quiroga 
 */
public class Person implements Serializable {
    private int age;
    private String name;
    private String proffesion;

    public Person(int age, String name, String proffesion) {
        this.age = age;
        this.name = name;
        this.proffesion = proffesion;
    }
    
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return the proffesion
     */
    public String getProffesion() {
        return proffesion;
    }

    /**
     * @param proffesion the proffesion to set
     */
    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + ", proffesion=" + proffesion + '}';
    }
    
    
}
