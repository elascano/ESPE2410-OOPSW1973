package ec.espe.edu.contactbook.model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author David Cuichan
 */
public class Contact {
    protected int id;
    protected String name;
    protected char sex;
    protected String gender;
    protected String maritalStatus;
    protected Calendar dateOfBirth;
    protected ArrayList<String> favoriteSports;
    protected String comments;

    public Contact(int id, String name, char sex, String gender, String maritalStatus, Calendar dateOfBirth, ArrayList<String> favoriteSports, String comments) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.dateOfBirth = dateOfBirth;
        this.favoriteSports = favoriteSports;
        this.comments = comments;
    }

    
    public Contact() {
    
    }
    
    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", dateOfBirth=" + dateOfBirth + ", favoriteSports=" + favoriteSports + ", comments=" + comments + '}';
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
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
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
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the dateOfBirth
     */
    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the favoriteSports
     */
    public ArrayList<String> getFavoriteSports() {
        return favoriteSports;
    }

    /**
     * @param favoriteSports the favoriteSports to set
     */
    public void setFavoriteSports(ArrayList<String> favoriteSports) {
        this.favoriteSports = favoriteSports;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
