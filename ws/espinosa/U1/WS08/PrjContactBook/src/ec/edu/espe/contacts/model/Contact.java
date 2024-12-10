package ec.edu.espe.contacts.model;

import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class Contact {

    private int id;
    private String name;
    private Date birthDate;
    private String email;
    private int numberOfMutualFriends;
    private int NumberOfOtherFrueds;
    private int totalFriends;

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name 
                + ", birthDate=" + birthDate + ", email=" 
                + email + ", numberOfMutualFriends=" + numberOfMutualFriends 
                + ", NumberOfOtherFrueds=" + NumberOfOtherFrueds 
                + ", totalFriends=" + totalFriends + '}';
    }
    
    public Contact(int id, String name, Date birthDate, String email, int numberOfMutualFriends, int NumberOfOtherFrueds, int totalFriends) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.numberOfMutualFriends = numberOfMutualFriends;
        this.NumberOfOtherFrueds = NumberOfOtherFrueds;
        this.totalFriends = totalFriends;
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
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    /**
     * @return the numberOfMutualFriends
     */
    public int getNumberOfMutualFriends() {
        return numberOfMutualFriends;
    }

    /**
     * @param numberOfMutualFriends the numberOfMutualFriends to set
     */
    public void setNumberOfMutualFriends(int numberOfMutualFriends) {
        this.numberOfMutualFriends = numberOfMutualFriends;
    }

    /**
     * @return the NumberOfOtherFrueds
     */
    public int getNumberOfOtherFrueds() {
        return NumberOfOtherFrueds;
    }

    /**
     * @param NumberOfOtherFrueds the NumberOfOtherFrueds to set
     */
    public void setNumberOfOtherFrueds(int NumberOfOtherFrueds) {
        this.NumberOfOtherFrueds = NumberOfOtherFrueds;
    }

    /**
     * @return the totalFriends
     */
    public int getTotalFriends() {
        return totalFriends;
    }

    /**
     * @param totalFriends the totalFriends to set
     */
    public void setTotalFriends(int totalFriends) {
        this.totalFriends = totalFriends;
    }
    
    
}
