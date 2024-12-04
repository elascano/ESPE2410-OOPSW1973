package hw12_savedata;

import ec.edu.ec.espe.HW12.model.Developer;
import util.FileManager;
import java.util.Scanner;
import util.CSVManager;
/**
 *
 * @author David Pilatasig
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce el nombre del developer:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el rol del developer:");
        String rol = scanner.nextLine();

        System.out.println("Introduce el ID del developer:");
        int id = scanner.nextInt();

        System.out.println("¿Está asignado a un proyecto? (true/false):");
        boolean asignadoProyecto = scanner.nextBoolean();

        Developer developer = new Developer(nombre, rol, id, asignadoProyecto);

        
        FileManager manager = new FileManager();
        manager.guardarEnJson(developer, "developer.json");
        CSVManager csvManager = new CSVManager();
        csvManager.guardarEnCSV(developer);
        scanner.close();
    }
}
    

