package Utils;

/**
 *
 * @author Robinson Bonilla
 */
public class MongoDBManager {
    
    public static void connect(String connectopmString){
        
    }
    
    public static boolean add (Object object){
        //TODO add any object
        String collectionName = null;
        boolean saved = false;
        try{
            collectionName = object.getClass().toString();
            System.out.println("saving --Z" + collectionName + ">--" + object);
            //call the method that is in
            saved=true;
        } catch(Exception Ex){
            System.out.println("Erro de guardado");
            saved=false;
        }
        return false;
    }
}
