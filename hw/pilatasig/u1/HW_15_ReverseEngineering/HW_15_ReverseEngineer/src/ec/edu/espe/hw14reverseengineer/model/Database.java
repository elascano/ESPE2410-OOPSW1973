
package ec.edu.espe.hw14reverseengineer.model;
import ec.edu.espe.hw14reverseengineer.model.Developer;
/**
 *
 * @author David Pilatasig
 */
class Database {
    private Developer[] developers;
    private Report[] reports;
    private boolean isConected;
    
    public boolean conect(boolean isConected){
        return true;
    }
    
    public boolean disconect(boolean isConected){
        return false;
    }
    
}
