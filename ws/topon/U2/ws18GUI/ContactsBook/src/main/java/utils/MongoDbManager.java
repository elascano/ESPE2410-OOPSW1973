package utils;

/**
 *
 * @author Mateo Topon
 */
public class MongoDbManager {
    
    public static void connect(String connectionString){
        System.out.println("connecting");
        
    }

    public static boolean add(Object object) {
        String collection=null;
        boolean saved = false;
        try {
            collection = object.getClass().toString();
            System.out.println("saving -->" + collection + "<--" + object);
            saved = true;


        } catch (Exception ex) {
            System.out.println("error on saving" + collection +"");
            saved = false;
        }
        return saved;
    }

}
