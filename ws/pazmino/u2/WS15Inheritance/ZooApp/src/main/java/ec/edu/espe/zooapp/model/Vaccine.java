package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino
 */
public class Vaccine {

    public Vaccine(int vaccineId, String vaccineName) {
    }
    
    int id;
    String description;
    String name;
    Date borOnDate;
    float weight;
    char sex;
    ArrayList<Vaccine> vaccines;

}
