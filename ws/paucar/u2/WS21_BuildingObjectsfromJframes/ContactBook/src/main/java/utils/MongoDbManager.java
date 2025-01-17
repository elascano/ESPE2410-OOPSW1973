package utils;

/**
 *
 * @author Dennis Paucar
 */
public class MongoDbManager {
    public static void connect(String connectionString){
        System.out.println("Connecting");
    }
    
    public static boolean add(Object object){
        //TODO add any object to the database
        String collectionName = null;
        boolean saved = false;
        try{
        collectionName = object.getClass().getCanonicalName();
        System.out.println("Saving -->" + collectionName + "<-- " + object);
        //implement the saving data for any object.
        
        saved = true;
        }catch(Exception ex){
            System.out.println("Error on saving " + collectionName + "");
            saved = false;
        }
        return saved;
    }
}
