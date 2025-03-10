
package ec.edu.espe.model;

/**
 *
 * @author USUARIO
 */

import org.bson.Document;
import utils.Age;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Document toDocument() {
        Document doc = new Document("name", name)
                           .append("birthYear", birthYear);
        return doc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
}
