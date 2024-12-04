
package ec.edu.espe.jsonfilemanager.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class Customer {
    private String name;
    private int id;
    private String email;

    public Customer(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
