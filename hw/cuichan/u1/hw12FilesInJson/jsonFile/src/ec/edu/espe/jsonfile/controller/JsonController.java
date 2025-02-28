package ec.edu.espe.jsonfile.controller;

import ec.edu.espe.jsonfile.model.JsonData;
import ec.edu.espe.jsonfile.model.JsonFile;
/**
 *
 * @author David Cuichan
 */

public class JsonController {
    private final JsonFile dataDao;
    
    public JsonController(String filePath) {
        this.dataDao = new JsonFile(filePath);
    }
    
    /**
     * Guarda un objeto JsonData
     * @param data Datos a guardar
     * @return true si la operación fue exitosa
     */
    public boolean saveData(JsonData data) {
        return dataDao.save(data.getKey(), data.getValue());
    }
}
