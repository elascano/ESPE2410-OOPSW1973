package ec.edu.espe.contactbook.utils;

/**
 *
 * @author mateo
 */
public class MongoDbManager {
    
    public void connect(String connectionString){
        System.out.println("connecting...");
    }
    
    public boolean add(Object object){
        String collectionName = null;
        boolean saved =false;
        try{
            collectionName = object.getClass().toString();
            System.out.println("saving------> "+collectionName + "<-----" + object);
            saved = true;
        }catch(Exception ex){
            System.out.println("error on saving data " + collectionName + "");
            saved = false;
        }
        return saved;
    }
    
}
