package ec.edu.espe.mole.view;

import ec.edu.espe.mole.exception.ProjectNotFoundException;
import ec.edu.espe.mole.model.Support;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Marlon Pasquel
 */

public class SupportMenu {

    private static final List<Support> supports = new ArrayList<>();
    private static final List<String> projectIds = List.of("P001", "P002", "P003"); 

    public static void manageSupportMenu(Scanner scanner) {
        System.out.println("\n--- Gestionar soportes ---");

        String relatedProjectId;
        while (true) {
            System.out.print("Ingrese el ID del proyecto asociado al soporte: ");
            relatedProjectId = scanner.nextLine().trim();
            if (!relatedProjectId.isEmpty()) {
                break;
            }
            System.out.println("Error: Este campo no puede estar vacío. Inténtelo nuevamente.");
        }

        int supportType;
        while (true) {
            System.out.print("Ingrese la duración del soporte (1, 3 o 5 años): ");
            String supportTypeStr = scanner.nextLine().trim();
            if (supportTypeStr.matches("[135]")) {
                supportType = Integer.parseInt(supportTypeStr);
                break;
            }
            System.out.println("Error: Ingrese una duración válida (1, 3 o 5).");
        }

        String format;
        while (true) {
            System.out.print("Ingrese el formato del soporte (8*5 o 24*7): ");
            format = scanner.nextLine().trim();
            if (format.equals("8*5") || format.equals("24*7")) {
                break;
            }
            System.out.println("Error: Formato inválido. Debe ser '8*5' o '24*7'.");
        }

        try {
            Support support = new Support(relatedProjectId, supportType, format, projectIds);
            supports.add(support);
            System.out.println("Soporte generado exitosamente: \n" + support);
        } catch (ProjectNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listSupports(List<Support> supports1) {
        System.out.println("\n--- Lista de soportes ---");
        if (supports.isEmpty()) {
            System.out.println("No se encontraron soportes.");
            return;
        }

        for (Support support : supports) {
            System.out.println(support);
        }
    }
}
