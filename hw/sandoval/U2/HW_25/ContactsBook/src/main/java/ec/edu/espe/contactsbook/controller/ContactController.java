package ec.edu.espe.contactsbook.controller;

import ec.edu.espe.contactsbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.MongoDbManager;

/**
 *
 * @author Lisbeth Tipan
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean  added = false;
        if (MongoDbManager.add(contact)){
            added = true;
        }
        return added;
    }
    public Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(2002, 1, 2);
        
        Object object = new Contact(3, "Benjamin", 'f', "man", "single", dateOfBirth, favoriteSports, "He has a kid");
        if (findString.equals("1")){
            return object;
            
            
        }
        return null;
    }
    
    public class TablePopulator {
    public void populateTable(javax.swing.JTable table, List<Document> data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (Document doc : data) {
            Object[] row = {
                doc.getString("Id"),
                doc.getString("Name"),
                doc.getString("Sex"),
                doc.getString("Gender"),
                doc.getString("Marital Status"),
                doc.getString("Comments")
            };
            model.addRow(row);
        }
    }
}
    
    
}
