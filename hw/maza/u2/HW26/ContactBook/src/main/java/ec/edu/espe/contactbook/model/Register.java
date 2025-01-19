package ec.edu.espe.contactbook.model;

/**
 *
 * @author Alexander Maza
 */
public class Register {
    private int id;
    private String name;
    private String gender;
    private String phoneNumber;
    private String password;

    
    
    public Register(int id, String name, String gender, String phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Contact{" + "\nid=" + getId() + ", \nname=" + getName() + ", \ngender=" + getGender() + ", \ntelefono=" + getPhoneNumber() + ", \npassword=" + getPassword() + '}';
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
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

   
    

}
