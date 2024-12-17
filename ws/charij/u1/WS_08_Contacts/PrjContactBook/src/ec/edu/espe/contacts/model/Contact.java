package ec.edu.espe.contacts.model;

import java.util.Date;

/**
 *
 * @author Sebastian Charij
 */
public class Contact {
    private int id; 
    private String name; 
    private Date birthDate;
    private String email;
    private int numberOfMutualFriend;
    private int numberOfOtherFriends;
    private int totalFriends;

    @Override
    public String toString() {
        return "Contact{" + "\n\tid=" + id + ", name=" + name + ",\nbirthDate=" 
        + birthDate + ", \n\temail=" + email + ", \nnumberOfMutualFriend=" 
        + numberOfMutualFriend + ", \nnumberOfOtherFriends=" 
        + numberOfOtherFriends + ", \ntotalFriends=" + totalFriends + '}';
    } 

    public Contact(int id, String name, Date birthDate, String email, int numberOfMutualFriend, int numberOfOtherFriends, int totalFriends) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.numberOfMutualFriend = numberOfMutualFriend;
        this.numberOfOtherFriends = numberOfOtherFriends;
        this.totalFriends = numberOfMutualFriend + numberOfOtherFriends;
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
     * @return the numberOfMutualFriend
     */
    public int getNumberOfMutualFriend() {
        return numberOfMutualFriend;
    }

    /**
     * @param numberOfMutualFriend the numberOfMutualFriend to set
     */
    public void setNumberOfMutualFriend(int numberOfMutualFriend) {
        this.numberOfMutualFriend = numberOfMutualFriend;
    }

    /**
     * @return the numberOfOtherFriends
     */
    public int getNumberOfOtherFriends() {
        return numberOfOtherFriends;
    }

    /**
     * @param numberOfOtherFriends the numberOfOtherFriends to set
     */
    public void setNumberOfOtherFriends(int numberOfOtherFriends) {
        this.numberOfOtherFriends = numberOfOtherFriends;
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

