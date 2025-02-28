package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDBManager;

public class ContactController {
    public boolean add(Contact contact) {
        boolean added = false;
        if (MongoDBManager.add(contact)) {
            added = true;
        }
        return added;
    }

    public Object find(String findString) {
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("cheese");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 2004);
        dateOfBirth.set(Calendar.MONTH, 6);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 30);

        Object object = new Contact(3, "Camila Bohorquez", 'f', "woman", "single", dateOfBirth, favoriteSports, "He has not a kid");
        if (findString.equals("1")) {
            return object;
        }
        return object;
    }
}
