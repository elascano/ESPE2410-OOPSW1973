
package ec.edu.espe.objectfilecreator.view;

import ec.edu.espe.objectfilecreator.model.Person;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esteban Quiroga 
 */
public class ObjectFileCreatorApp {

    public static void main(String[] args) {

    Person person = new Person(19, "Esteban", "Engineer");
    FileOutputStream objectsFile = null;
    FileInputStream readFile =null;
    
    try{
        objectsFile = new FileOutputStream("people.txt");
    
        ObjectOutputStream writer = new ObjectOutputStream(objectsFile);
        
        writer.writeObject(person);
        
        System.out.println("FILE CREATED SUCCESFULLY");
        
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
 
        System.out.println("Leer el archivo de tipo objeto...");
        
     try{
        readFile = new FileInputStream("people.txt");
    
        ObjectInputStream reader;
        
        while(readFile.available()>0){
            reader = new ObjectInputStream(readFile); 
            try {
                person = (Person) reader.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ObjectFileCreatorApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(person);
        }
        
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
