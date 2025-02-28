package ec.edu.espe.jsonfile.view;

import ec.edu.espe.jsonfile.controller.JsonController;
import ec.edu.espe.jsonfile.model.Json;

/**
 *
 * @author David Cuichan
 */
public class JsonFileApp {
    public static void main(String[] args) {
    String filePath = "datos.json";
        
        JsonController controller = new JsonController(filePath);
        
        Json view = new Json(controller);
        
        view.start();
    }
        
}
