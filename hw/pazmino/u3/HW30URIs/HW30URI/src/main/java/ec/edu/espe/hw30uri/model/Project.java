package ec.edu.espe.hw30uri.model;

import org.bson.Document;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino
 */
public class Project {

    private String projectId;
    private String projectTitle;
    private String projectDescription;
    private String startDate;
    private String closingDate;
    private double startQuote;
    private String operationalStatus;
    private String quoteStatus;
    private boolean paid;
    private boolean invoiced;
    private boolean isPublic;

    public Project(String projectId, String projectTitle, String projectDescription, String startDate, String closingDate,
            double startQuote, String operationalStatus, String quoteStatus, boolean paid, boolean invoiced, boolean isPublic) {
        this.projectId = projectId;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.startQuote = startQuote;
        this.operationalStatus = operationalStatus;
        this.quoteStatus = quoteStatus;
        this.paid = paid;
        this.invoiced = invoiced;
        this.isPublic = isPublic;
    }

    public Document toDocument() {
        return new Document("projectId", projectId)
                .append("projectTitle", projectTitle)
                .append("projectDescription", projectDescription)
                .append("startDate", startDate)
                .append("closingDate", closingDate)
                .append("startquote", startQuote)
                .append("operationalStatus", operationalStatus)
                .append("quoteStatus", quoteStatus)
                .append("paid", paid)
                .append("invoiced", invoiced)
                .append("isPublic", isPublic);
    }
}
