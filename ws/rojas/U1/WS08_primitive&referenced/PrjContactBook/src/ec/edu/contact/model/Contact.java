package ec.edu.contact.model;

import java.util.Date;

/**
 *
 * @author Matias Rojas
 */
public class Contact {
    private int id;
    private String name;
    private Date birthDate;
    private String small;
    private int numberOfMutualFriends;
    private int numberOfOtherFriends;
    private int totalFriends;

    public Contact(int id, String name, Date birthDate, String small, int numberOfMutualFriends, int numberOfOtherFriends, int totalFriends) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.small = small;
        this.numberOfMutualFriends = numberOfMutualFriends;
        this.numberOfOtherFriends = numberOfOtherFriends;
        this.totalFriends = totalFriends;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" 
                + name + ", birthDate=" + birthDate + ", small=" 
                + small + ", numberOfMutualFriends=" + numberOfMutualFriends + ", numberOfOtherFriends=" 
                + numberOfOtherFriends + ", totalFriends=" + totalFriends + '}';
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
     * @return the small
     */
    public String getSmall() {
        return small;
    }

    /**
     * @param small the small to set
     */
    public void setSmall(String small) {
        this.small = small;
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
