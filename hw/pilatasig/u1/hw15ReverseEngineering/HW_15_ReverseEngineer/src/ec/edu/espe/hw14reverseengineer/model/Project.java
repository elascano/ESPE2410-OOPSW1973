package ec.edu.espe.hw14reverseengineer.model;

import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class Project {
    private String name;
    private String shortDescription;
    private Date projectStartDate;
    private Date projectFinalDate;
    private float quote;
    private String purchaseOrderDocument;
    private Customer customer;
    private Status projectStatus;
    private Notification statusNotification;

    
    public static void printProjectDescription(){
        
    }
    public static Status getProjectSatatus(Status projectStatus){
        return projectStatus;
    }
    public static String writeProjectDescription(String shortDescription){
        return shortDescription;
    }
    public static void getListOfProject(){
        
    }
}
