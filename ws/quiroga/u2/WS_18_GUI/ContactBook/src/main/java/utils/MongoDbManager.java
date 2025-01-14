
package utils;

/**
 *
 * @author Esteban Quiroga 
 */
public class MongoDbManager {

    public void connect (String connectionString){
        System.out.println("Connecting...");
    }

    public static boolean add(Object object) {
        
        //TODO add any object to the database
        String collectionName = null;
        boolean saved = false;
        try {
            collectionName = object.getClass().toString();
            System.out.println("saving -->" + collectionName + "<--" + object);
            //implement the saving data for any object.
            saved = true;
        } catch (Exception ex) {
            System.out.println("error saving " + collectionName + "");
            saved = false;
        }
        return saved;
    }
}
