package ec.edu.espe.contactbook.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
    private Date dateOfBirth;  // Cambié Calendar a Date
    private ArrayList<String> favoriteSport;
    private String comments;

    public Contact(int id, String name, char sex, String gender, String maritalStatus, Calendar dateOfBirth, ArrayList<String> favoriteSport, String comments) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.dateOfBirth = dateOfBirth.getTime(); 
        this.favoriteSport = favoriteSport;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Contact{" + "id-->" + id + "\nname-->" + name +
                "\nsex-->" + sex + "\ngender-->" + gender + 
                "\nmaritalStatus-->" + maritalStatus + "\ndateOfBirth-->" + dateOfBirth + 
                "\nfavoriteSport-->" + favoriteSport + "\n comments-->" + comments + '}';
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth.getTime(); 
    }

    public ArrayList<String> getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(ArrayList<String> favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
