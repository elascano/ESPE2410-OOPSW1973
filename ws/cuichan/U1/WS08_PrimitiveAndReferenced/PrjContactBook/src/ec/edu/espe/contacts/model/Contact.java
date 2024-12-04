package ec.edu.espe.contacts.model;

import java.util.Date;

/**
 *
 * @author David Cuichan
 */
public class Contact {

    private int id;
    private String name;
    private Date birthDate;
    private String email;
    private int numberOfMutualFriends;
    private int numberOfOtherFriends;
    private int totalFriends;

    public Contact(int id, String name, Date birthDate, int numberOfMutualFriends, int numberOfOtherFriends) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.numberOfMutualFriends = numberOfMutualFriends;
        this.numberOfOtherFriends = numberOfOtherFriends;
        this.totalFriends = totalFriends;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + 
               ", \nname=" + name + 
               ", \nbirthDate=" + birthDate + 
               ", \nemail=" + email + 
               ", \nnumberOfMutualFriends=" + numberOfMutualFriends + 
               ", \nnumberOfOtherFriends=" + numberOfOtherFriends + 
               ", \ntotalFriends=" + totalFriends + '}';
    }

    
    /**
     * @return the id
     */
    private int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    private String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthDate
     */
    private Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the email
     */
    private String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    private void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numberOfMutualFriends
     */
    private int getNumberOfMutualFriends() {
        return numberOfMutualFriends;
    }

    /**
     * @param numberOfMutualFriends the numberOfMutualFriends to set
     */
    private void setNumberOfMutualFriends(int numberOfMutualFriends) {
        this.numberOfMutualFriends = numberOfMutualFriends;
    }

    /**
     * @return the numberOfOtherFriends
     */
    private int getNumberOfOtherFriends() {
        return numberOfOtherFriends;
    }

    /**
     * @param numberOfOtherFriends the numberOfOtherFriends to set
     */
    private void setNumberOfOtherFriends(int numberOfOtherFriends) {
        this.numberOfOtherFriends = numberOfOtherFriends;
    }

    /**
     * @return the totalFriends
     */
    private int getTotalFriends() {
        return totalFriends;
    }

    /**
     * @param totalFriends the totalFriends to set
     */
    private void setTotalFriends(int totalFriends) {
        this.totalFriends = totalFriends;
    }

    
}
