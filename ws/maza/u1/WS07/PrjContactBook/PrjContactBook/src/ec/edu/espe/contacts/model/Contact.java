package ec.edu.espe.contacts.model;

import java.util.Date;

/**
 *
 * @author Alexander Maza
 */
public class Contact {

    @Override
    public String toString() {
        return """
               Contact{
               \tid=""" + id + ", \n\tname=" + name + ", \n\tbirthDate=" + birthDate + ", \n\temail=" + email + ", \n\tnumberOfMutualFriends=" + numberOfMutualFriends + ", \n\tnumberOfOtherFriends=" + numberOfOtherFriends + ", totalFriends=" + totalFriends + '}';
    }
    private int id;
    private String name;
    private Date birthDate;
    private String email;
    private int numberOfMutualFriends;
    private int numberOfOtherFriends;
    private int totalFriends;

    public Contact(int id, String name, Date birthDate, String email, int numberOfMutualFriends, int numberOfOtherFriends, int totalFriends) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.numberOfMutualFriends = numberOfMutualFriends;
        this.numberOfOtherFriends = numberOfOtherFriends;
        this.totalFriends = totalFriends;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfMutualFriends() {
        return numberOfMutualFriends;
    }

    public void setNumberOfMutualFriends(int numberOfMutualFriends) {
        this.numberOfMutualFriends = numberOfMutualFriends;
    }

    public int getNumberOfOtherFriends() {
        return numberOfOtherFriends;
    }

    public void setNumberOfOtherFriends(int numberOfOtherFriends) {
        this.numberOfOtherFriends = numberOfOtherFriends;
    }

    public int getTotalFriends() {
        return totalFriends;
    }

    public void setTotalFriends(int totalFriends) {
        this.totalFriends = totalFriends;
    }
    
    
}
