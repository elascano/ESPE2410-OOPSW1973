
package ec.edu.espe.objectfilecreator.view;

import ec.edu.espe.objectfilecreator.model.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Esteban Quiroga 
 */
public class ObjectFileCreatorApp {

    public static void main(String[] args) {

    Person person = new Person(19, "Esteban", "Ingeniero");
    FileOutputStream objectsFile = null;
    
    try{
        objectsFile = new FileOutputStream("people.txt");
    
        ObjectOutputStream writer = new ObjectOutputStream(objectsFile);
        
        writer.writeObject(person);
        
        }catch(FileNotFoundException ex){
        ex.printStackTrace();
    }   catch (IOException ex){
        ex.printStackTrace();
    }  finally {
        try{
            objectsFile.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    } 
 
}
}
