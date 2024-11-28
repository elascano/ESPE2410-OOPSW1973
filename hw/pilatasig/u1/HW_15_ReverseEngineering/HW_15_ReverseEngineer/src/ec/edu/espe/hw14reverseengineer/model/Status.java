
package ec.edu.espe.hw14reverseengineer.model;

/**
 *
 * @author David Pilatasig
 */
public class Status {
    private String name;
    private String description;
    private int id;
    private boolean isCancelled;
    private boolean inProgress;

    public Status(String name, String description, int id, boolean isCancelled, boolean inProgress) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.isCancelled = isCancelled;
        this.inProgress = inProgress;
    }
    
    
    public boolean getStatus(boolean isCancelled, boolean inProgress){
        return false;
    }
    
    public String writeStatus(){
        return description;
    }
}
