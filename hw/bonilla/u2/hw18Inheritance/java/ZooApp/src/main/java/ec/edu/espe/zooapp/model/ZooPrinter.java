package ec.edu.espe.zooapp.model;

/**
 *
 * @author Robinson Bonilla
 */

public class ZooPrinter {

    public static void printAnimalDetails(Animal animal, Cage cage) {
        System.out.println("----- " + animal.getClass().getSimpleName() + " -----");
        System.out.println(animal);
        System.out.println("Cage: " + cage);
        System.out.println();
    }
}
