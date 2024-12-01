package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.*;
import utils.FileManager;

/**
 *
 * @author Sebastian Charij
 */
public class FarmSimulatorApp {

    // private static ArrayList<Chicken> chickens;
    public static void main(String[] args) {
        System.out.println("Sebastian´s Chicken Farm Simulator");

        Scanner sc = new Scanner(System.in);
        char opcion;

        ArrayList<Chicken> chickens;
        chickens = new ArrayList<Chicken>();
        Chicken chicken = null;

        do {
            System.out.println("*** Menu ***");
            System.out.println("1.- Enter chicken");
            System.out.println("2.- Read chicken");
            System.out.println("3.- Update chicken ");
            System.out.println("3.- Delete chicken");
            System.out.print("Enter the option: ");

            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("Enter");
                    chicken = new Chicken();
                    chicken.enterChicken();
                    chickens.add(chicken);

                    // Convertir el objeto Chicken a JSON manualmente
                    String jsonData = chicken.toJson();

                    // Guardar los datos JSON en un archivo usando FileManager
                    FileManager.save(jsonData, "chicken_" + chicken.getId(), "json");

                    // Guardar en CSV
                    String[] headers = {"ID", "Name", "Color", "AgeMonths", "BornOnDate", "NotMolting"};
                    String[] values = {
                        String.valueOf(chicken.getId()),
                        chicken.getName(),
                        chicken.getColor(),
                        //String.valueOf(chicken.getAgeMonths()),
                        chicken.getBornOnDate().toString(),
                        String.valueOf(chicken.isNotMolting())
                    };
                    FileManager.saveToCsv("chickens", headers, values);

                    System.out.println("Chicken added: " + chicken);
                    break;
                case '2':
                    System.out.println("Listing all chickens:");
                    // Lee las gallinas desde el archivo JSON
                    chickens = FileManager.readChickensFromJson("C:\\Users\\Usuario\\ESPE2410-OOPSW1973\\ws\\charij\\u1\\WS_07_ChickenFarm\\ChickenFarmSimulator\\chicken_10.json"); // Cambia la ruta según sea necesario
                    chicken.readChicken(chickens);
                    break;
                case '3':
                    System.out.println("Updating chicken...");
                    System.out.print("Enter ID of a chicken to update: ");
                    int up = sc.nextInt();
                    Chicken chickenToUpdate = chicken.findChickenById(chickens, up);
                    if (chickenToUpdate != null) {
                        chicken.updateChicken(chickenToUpdate);
                    } else {
                        System.out.println("Chicken with ID " + up + " not found.");
                    }
                    break;
                default:
                    System.out.println("Mal ingresado la opcion....");
                case '4':
                    System.out.println("Deleting chicken...");
                    System.out.print("Enter ID of a chicken to delete: ");
                    int idToDelete = sc.nextInt();
                    chicken.deleteChicken(chickens, idToDelete);
                    break;

            }
        } while (opcion != '5');
    }

}
