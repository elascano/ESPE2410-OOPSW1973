package ec.edu.espe.contactbook.model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author David Pilatasig
 */
public class Contact {
    private int id;
    private String name;
    private String sex;
    private String gender;
    private String maritalStatus;
    private Calendar dateOfBrith;
    private ArrayList<String> favoriteSports;
    private String comments;

    public Contact(int id, String name, String sex, String gender, String maritalStatus, Calendar dateOfBrith, ArrayList<String> favoriteSports, String comments) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.dateOfBrith = dateOfBrith;
        this.favoriteSports = favoriteSports;
        this.comments = comments;
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
     * @return the sex
     */
    private String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    private void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the gender
     */
    private String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    private void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the maritalStatus
     */
    private String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    private void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the dateOfBrith
     */
    private Calendar getDateOfBrith() {
        return dateOfBrith;
    }

    /**
     * @param dateOfBrith the dateOfBrith to set
     */
    private void setDateOfBrith(Calendar dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    /**
     * @return the favoriteSports
     */
    private ArrayList<String> getFavoriteSports() {
        return favoriteSports;
    }

    /**
     * @param favoriteSports the favoriteSports to set
     */
    private void setFavoriteSports(ArrayList<String> favoriteSports) {
        this.favoriteSports = favoriteSports;
    }

    /**
     * @return the comments
     */
    private String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    private void setComments(String comments) {
        this.comments = comments;
    }

    
    
}
