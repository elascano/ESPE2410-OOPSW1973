package ec.edu.espe.hw17table.view;
import ec.edu.espe.hw17table.model.Table;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 *
 * @author Brandon Pazmino
 */
public class SaveObjectTable {
    public static void main(String[] args) {
        String fileName = "TableData";
        
        Table table = new Table("Mahogany",3,1.2F,"Brown");
        
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut)){
            objOut.writeObject(table);
            System.out.println("The Object table is correctly saved -->" + fileName);
        } catch (IOException e) {
            System.err.println("Error -->" + e.getMessage());
        }
        
        try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream objIn = new ObjectInputStream(fileIn)){
            Table loadedTable = (Table) objIn.readObject();
            System.out.println("The Object is Correctly loaded:");
            System.out.println(loadedTable);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error -->" + e.getMessage());
        }
    }
}
