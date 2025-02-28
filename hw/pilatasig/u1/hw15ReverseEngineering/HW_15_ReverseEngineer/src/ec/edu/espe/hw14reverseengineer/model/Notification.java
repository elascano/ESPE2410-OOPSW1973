
package ec.edu.espe.hw14reverseengineer.model;

import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class Notification {
    private int id;
    private String title;
    private Date sendDate;
    private String status;
    private String message;

    public Notification(int id, String title, Date sendDate, String status, String message) {
        this.id = id;
        this.title = title;
        this.sendDate = sendDate;
        this.status = status;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSendDate() {
        return sendDate;
    }


    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }


    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
