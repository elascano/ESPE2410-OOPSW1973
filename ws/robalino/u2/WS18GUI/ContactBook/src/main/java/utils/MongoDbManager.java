

package utils;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class MongoDbManager {
    public boolean add(Object object){
        //TODO add any 
        String collectionName = null;
        boolean saved=false;
        try{
         collectionName = object.getClass().toString();
        System.out.println("saving --->" + collectionName + "<----" + object);
        //implement the savif code por any object
        saved = true;}
        catch(Exception ex){
            System.out.println("Error on saving" + collectionName + "");
        saved = false;
        }
        return saved;
    }
}
