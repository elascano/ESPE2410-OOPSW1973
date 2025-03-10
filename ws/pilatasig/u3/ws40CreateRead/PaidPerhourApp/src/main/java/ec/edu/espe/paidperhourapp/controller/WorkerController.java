package ec.edu.espe.paidperhourapp.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.paidperhourapp.model.Worker;
import java.util.List;
import org.bson.Document;
import utils.MongoDBConnection;

/**
 *
 * @author David Pilatasig
 */
public class WorkerController extends BaseController<Worker>{

    @Override
    protected MongoCollection<Document> getCollection() {
        return MongoDBConnection.getDatabase().getCollection("Workers");
    }
    
    public static float calculatePay(float workedHours, float paidPerHour){
        float pay;
        pay= workedHours*paidPerHour;
        return pay;
    }
    
       public boolean saveWorker(Worker worker){
        save(worker);      
        return true;
    }
       
    public void findAllWorkers(){
        findAll();
    }
    
}
