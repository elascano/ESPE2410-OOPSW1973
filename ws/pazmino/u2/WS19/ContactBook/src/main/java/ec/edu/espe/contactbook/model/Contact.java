package ec.edu.espe.contactbook.model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Brandon Pazmino
 */
public class Contact {
    private int id;
    private String name;
    private char sex;
    private String gender;
    private String maritalStatus;
    private Calendar dateOfBirth;
    private ArrayList<String> favoriteSport;
    private String comments;

    public Contact(int id, String name, char sex, String gender, String maritalStatus, Calendar dateOfBirth, ArrayList<String> favoriteSport, String comments) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.dateOfBirth = dateOfBirth;
        this.favoriteSport = favoriteSport;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Contact{" + "id-->" + id + "\nname-->" + name +
                "\nsex-->" + sex + "\ngender-->" + gender + 
                "\nmaritalStatus-->" + maritalStatus + "\ndateOfBirth-->" + dateOfBirth.get(Calendar.MONTH + 1) + 
                "\nfavoriteSport-->" + favoriteSport + "\n comments-->" + comments + '}';
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
     * @return the favoriteSport
     */
    public ArrayList<String> getFavoriteSport() {
        return favoriteSport;
    }

    /**
     * @param favoriteSport the favoriteSport to set
     */
    public void setFavoriteSport(ArrayList<String> favoriteSport) {
        this.favoriteSport = favoriteSport;
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
