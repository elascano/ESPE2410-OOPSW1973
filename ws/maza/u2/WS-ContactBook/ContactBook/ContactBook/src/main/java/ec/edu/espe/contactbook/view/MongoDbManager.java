
package ec.edu.espe.contactbook.view;

/**
 *
 * @author Alexander Maza
 */
public class MongoDbManager {
    
    public static void connect(String connectionString){
        System.out.println("connection");
    
    }
    
    public static boolean add(Object object) {
        //TODO Aadd any object to the data base
        String collectionName = null;
        boolean saved = false;
        try{
            collectionName = object.getClass().getCanonicalName();
            System.out.println("saving -->" + collectionName + "<--" + object);
            //implement the saving code for any object
            saved = true;
        } catch(Exception ex) {
            System.out.println("error on saving" + collectionName + "");
            saved = false;
        }
        return false;
    }
}