package jsoncrud;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dennis Paucar
 */


public class CrudJsonArrayList {
    private static final String FILE_PATH = "C:\\\\NetBeans\\\\JsonCRUD\\\\data.json"; 
    private static final Gson gson = new Gson();
    private static ArrayList<Item> items = new ArrayList<>(); 

    public static void main(String[] args) {
        loadData(); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu CRUD con ArrayList ---");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    createItem(scanner);
                    break;
                case 2:
                    readItems();
                    break;
                case 3:
                    updateItem(scanner);
                    break;
                case 4:
                    deleteItem(scanner);
                    break;
                case 5:
                    saveData(); 
                    System.out.println("Saliendo");
                    return;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }


    private static void loadData() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Item>>() {}.getType();
            items = gson.fromJson(reader, listType);
            if (items == null) {
                items = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("No se encontro el archivo. Se iniciara con una lista vacia.");
        }
    }

  
    private static void saveData() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(items, writer);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }

    
    private static void createItem(Scanner scanner) {
        System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre: ");
        String name = scanner.nextLine();

        items.add(new Item(id, name));
        System.out.println("Elemento agregado exitosamente.");
    }


    private static void readItems() {
        if (items.isEmpty()) {
            System.out.println("No hay elementos para mostrar.");
        } else {
            System.out.println("\n--- Lista de Elementos ---");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

  
    private static void updateItem(Scanner scanner) {
        System.out.print("Ingrese el ID del elemento a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        for (Item item : items) {
            if (item.getId() == id) {
                System.out.print("Ingrese el nuevo nombre: ");
                String newName = scanner.nextLine();
                item.setName(newName);
                System.out.println("Elemento actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Elemento con ID " + id + " no encontrado.");
    }

  
    private static void deleteItem(Scanner scanner) {
        System.out.print("Ingrese el ID del elemento a eliminar: ");
        int id = scanner.nextInt();

        if (items.removeIf(item -> item.getId() == id)) {
            System.out.println("Elemento eliminado exitosamente.");
        } else {
            System.out.println("Elemento con ID " + id + " no encontrado.");
        }
    }


    static class Item {
        private int id;
        private String name;

        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Nombre: " + name;
        }
    }
}

