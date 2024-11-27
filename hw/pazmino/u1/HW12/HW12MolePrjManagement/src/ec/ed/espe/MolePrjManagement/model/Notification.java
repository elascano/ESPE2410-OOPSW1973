package ec.ed.espe.MolePrjManagement.model;

/**
 *
 * @author Brandon Pazmino
 */
public class Notification {
    private int notificationID;
    private String title;
    private Date sendDate;
    private String status;
    private String message;

    @Override
    public String toString() {
        return "Notification{" + "notificationID=" + notificationID + ", title=" + title + ", status=" + status + ", message=" + message + '}';
    }

    public Notification(int notificationID, String title, String status, String message) {
        this.notificationID = notificationID;
        this.title = title;
        this.status = status;
        this.message = message;
    }
    
    
}
