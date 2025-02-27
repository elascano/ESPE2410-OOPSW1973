package utils;

/**
 *
 * @author David Cuichan
 */
public class MongoManager {
    public static void connect(String conectToString){
        
    }
    
    public static boolean add(Object object){
        //TODO add any object
        String collectionName = null;
        boolean saved = false;
        
        try {
            collectionName = object.getClass().toString();
            System.out.println("Saving --> " + collectionName + "<--" + object);
            //call the method that is in
            saved = true;
        } catch (Exception ex) {
            System.out.println("Error for saving");
            saved = false;
        }
        return false;
    }

}
