package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.MongoDbManager;

/**
 *
 * @author Lisbeth Tipan
 */
public class ContactController {
    public boolean add(Contact contact) {
    boolean added = false;
    
    
    Document contactDocument = new Document("id", contact.getId())
            .append("name", contact.getName())
            .append("sex", String.valueOf(contact.getSex()))
            .append("gender", contact.getGender())
            .append("maritalStatus", contact.getMaritalStatus())
            .append("dateOfBirth", contact.getDateOfBirth().getTime()) 
            .append("favoriteSports", contact.getFavoriteSports())
            .append("comments", contact.getComments());
    
    
    if(MongoDbManager.insert("contacts", contactDocument)){
        added = true;
    }
    return added;
}

    
    
    public Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 2000);
        dateOfBirth.set(Calendar.MONTH, 1);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 1);
        Contact object = new Contact(3, "Dennis", 'm', "man", "single", dateOfBirth, favoriteSports, "He has a kid");
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
    
    public void fillTableFromDatabase(JTable table) {
        List<Document> documents = MongoDbManager.getAll("contacts"); 
        String[] columnNames = {
            "ID", "Name", "Sex", "Gender", "Marital Status",
            "Date of Birth", "Favorite Sports", "Comments"
        };
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (Document doc : documents) {
            int id = doc.getInteger("id", 0); 
            String name = doc.getString("name") != null ? doc.getString("name") : "";
            char sex = doc.containsKey("sex") ? doc.getString("sex").charAt(0) : ' ';
            String gender = doc.getString("gender") != null ? doc.getString("gender") : "";
            String maritalStatus = doc.getString("maritalStatus") != null ? doc.getString("maritalStatus") : "";

            Calendar dateOfBirth = Calendar.getInstance();
            if (doc.containsKey("dateOfBirth")) {
                Object dobObject = doc.get("dateOfBirth");
                if (dobObject instanceof Date) {
                    dateOfBirth.setTime((Date) dobObject);
                } else if (dobObject instanceof Long) {
                    dateOfBirth.setTimeInMillis((Long) dobObject);
                }
            }
            String formattedDate = dateFormat.format(dateOfBirth.getTime());

            
            List<String> favoriteSports = doc.getList("favoriteSports", String.class);
            String sportsString = favoriteSports != null ? String.join(", ", favoriteSports) : "";

            String comments = doc.getString("comments") != null ? doc.getString("comments") : "";

           
            Object[] rowData = {
                id, name, sex, gender, maritalStatus, formattedDate, sportsString, comments
            };
            tableModel.addRow(rowData);
        }

        table.setModel(tableModel);
    }



            
}
