package ec.edu.espe.contactbook.model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Sebastian Charij
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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

    public Calendar getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(Calendar dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public ArrayList<String> getFavoriteSports() {
        return favoriteSports;
    }

    public void setFavoriteSports(ArrayList<String> favoriteSports) {
        this.favoriteSports = favoriteSports;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    

    @Override
    public String toString() {
        return "id=" + id + 
                "\nname=" + name + 
                "\nsex=" + sex + 
                "\ngender=" + gender + 
                "\nmaritalStatus=" + maritalStatus + 
                "\ndateOfBrith=" + dateOfBrith.get(Calendar.MONTH+1) + 
                "\nfavoriteSports=" + favoriteSports + 
                "\ncomments=" + comments + '}';
    }

    
    
}
