package ec.edu.espe.view;
import ec.edu.espe.model.MongoControl;
import java.util.Scanner;


/**
 *
 * @author Andres Sandoval
 */
public class MainMongo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MongoControl dbManager = new MongoControl("mongodb+srv://aesandoval:aesandoval@cluster0.5z3gp.mongodb.net/", "HWSaveDate");

        OUTER:
        while (true) {
            System.out.println("Main:");
            System.out.println("1. Data Entry");
            System.out.println("2. Data Find");
            System.out.println("3. Delete Data");
            System.out.println("4. exit");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    {
                        System.out.println("Enter the ID:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Name:");
                        String name = scanner.nextLine();
                        System.out.println("NRC:");
                        int nrc = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("subject:");
                        String subject = scanner.nextLine();
                        dbManager.insertData(id, name, nrc, subject);
                        System.out.println("Saved Data.");
                        break;
                    }
                case 2:
                    {
                        System.out.println("Insert ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        dbManager.searchData(id);
                        break;
                    }
                case 3:
                    {
                        System.out.println("Insert ID to delete: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        dbManager.deleteDatas(id);
                        break;
                    }
                case 4:
                    System.out.println("Bye bye");
                    break OUTER;
                default:
                    break;
            }
        }
    }
}


