package ec.edu.espe.jsonfile.model;

import ec.edu.espe.jsonfile.controller.JsonController;

import java.util.Scanner;
/**
 *
 * @author David Cuichan
 */
public class Json {
    
    private final JsonController controller;
    private final Scanner scanner;
    
    public Json(JsonController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    
    public void start() {
        System.out.println("=== JSON ===");
        
        System.out.print("Password: ");
        String key = scanner.nextLine();
        
        System.out.print("Value: ");
        String value = scanner.nextLine();
        
        JsonData data = new JsonData(key, value);
        boolean success = controller.saveData(data);
        
        if (success) {
            System.out.println("Data saved");
        } else {
            System.out.println("Error in the System");
        }
        
        scanner.close();
    }
}
