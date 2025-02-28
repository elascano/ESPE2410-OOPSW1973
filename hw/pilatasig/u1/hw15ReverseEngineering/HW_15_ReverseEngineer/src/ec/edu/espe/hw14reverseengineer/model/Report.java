package ec.edu.espe.hw14reverseengineer.model;
import java.util.Date;
/**
 *
 * @author David Pilatasig
 */
public class Report {
    private Project id;
    private Date reportDate;
    private String projectName;
    private String[] projectCodes;
    private String projectObservation;
    private int completedProjectsCount;
    private int onGoingProjectsCount;
    private int cancelledProjectsCount;
    private int observedProjectsCount;
    private Status projectStatus;
    private float totalCost;
    private float vat;
    private float subtotal;
    private float total;
    
    
}
