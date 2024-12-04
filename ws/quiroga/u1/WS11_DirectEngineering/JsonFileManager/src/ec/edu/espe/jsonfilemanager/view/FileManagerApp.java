
package ec.edu.espe.jsonfilemanager.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.jsonfilemanager.model.Customer;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Esteban Quiroga 
 */
public class FileManagerApp {
    public static void main(String[] args) {
         
        Customer customer = new Customer("Juan", 1234, "juan@gmail.com");
       
        
        Gson gson = new GsonBuilder().create();
        gson.toJson(customer);
        
        try (FileWriter writer = new FileWriter("persona.json")) {
            gson.toJson(customer, writer);
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        Collection customerList;
        customerList = new ArrayList<Customer>();
        String filePath = "C:\\Users\\TEVS\\ESPE2410-OOPSW1973\\ws\\quiroga\\u1\\WS11_DirectEngineering\\JsonFileManager\\persona.json";
         
        try {
            // Leer el archivo JSON como String
            String json = Files.readString(Paths.get("C:\\Users\\TEVS\\ESPE2410-OOPSW1973\\ws\\quiroga\\u1\\WS11_DirectEngineering\\JsonFileManager\\persona.json"));

            // Imprimir el contenido
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        public class Main {
    public static void main(String[] args) {
        try {
            // Leer el archivo JSON
            String json = new String(Files.readAllBytes(Paths.get("persona.json")));

            // Crear un objeto Gson
            Gson gson = new Gson();

            // Convertir el JSON a un objeto Persona
            Persona persona = gson.fromJson(json, Persona.class);

            // Modificar el campo
            persona.nombre = "Carlos Gómez"; // Cambiar el nombre

            // Convertir el objeto Persona de nuevo a JSON
            String updatedJson = gson.toJson(persona);

            // Escribir el JSON modificado en el archivo
            Files.write(Paths.get("persona.json"), updatedJson.getBytes());

            System.out.println("El archivo JSON ha sido modificado.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
     try {
            // Leer el archivo JSON
            String json = new String(Files.readAllBytes(Paths.get("personas.json")));

            // Crear un objeto Gson
            Gson gson = new Gson();

            // Deserializar el JSON directamente a un ArrayList<Persona>
            ArrayList<Persona> personas = gson.fromJson(json, ArrayList.class);

            // Modificar el nombre de la persona con el email "ana.garcia@example.com"
            for (Persona persona : personas) {
                if (persona.email.equals("ana.garcia@example.com")) {
                    persona.setNombre("Ana Martínez"); // Cambiar el nombre
                }
            }

            // Convertir el ArrayList de personas de nuevo a JSON
            String updatedJson = gson.toJson(personas);

            // Escribir el JSON modificado en el archivo
            Files.write(Paths.get("personas.json"), updatedJson.getBytes());

            System.out.println("El archivo JSON ha sido modificado.");

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        try {
            // Leer el archivo JSON
            String json = new String(Files.readAllBytes(Paths.get("personas.json")));

            // Crear un objeto Gson
            Gson gson = new Gson();

            // Deserializar el JSON a un ArrayList de objetos Persona
            ArrayList<Persona> personas = gson.fromJson(json, new TypeToken<ArrayList<Persona>>(){}.getType());

            // Buscar y eliminar el objeto con nombre "Ana García"
            personas.removeIf(persona -> persona.getNombre().equals("Ana García"));

            // Convertir la lista modificada de nuevo a JSON
            String updatedJson = gson.toJson(personas);

            // Escribir el JSON modificado en el archivo
            Files.write(Paths.get("personas.json"), updatedJson.getBytes());

            System.out.println("El objeto ha sido eliminado.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
