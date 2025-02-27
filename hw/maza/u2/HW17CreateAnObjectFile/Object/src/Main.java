 import java.io.*;
 import java.util.ArrayList;
 import java.util.List;

 
/**
 *
 * @author gustavo
 */


public class Main {
    public static void main(String[] args) {
        String fileName = "notebooks.ser";
        List<Notebook> notebooks = new ArrayList<>();

        // Intentamos cargar la lista de notebooks desde el archivo
        try {
            // Intentamos leer el archivo si existe
            FileInputStream fileInputStream = new FileInputStream(fileName);
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                notebooks = (List<Notebook>) objectInputStream.readObject();
            }
            System.out.println("Lista cargada desde el archivo:");
            notebooks.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            // Si el archivo no existe, creamos un nuevo archivo con lista vacía
            System.out.println("El archivo no existe. Se creará un nuevo archivo.");
        } catch (IOException | ClassNotFoundException e) {
        }

        // Crear un nuevo Notebook de marca Dell (puedes cambiar las propiedades para probar diferentes casos)
        Notebook newNotebook = new Notebook("Lenovo", "ThinPad", 64, 2056);

        // Buscamos si ya existe un Notebook con el mismo modelo (marca + modelo)
        boolean found = false;
        for (Notebook notebook : notebooks) {
            if (notebook.getMarca().equals(newNotebook.getMarca()) && notebook.getModelo().equals(newNotebook.getModelo())) {
                // Si existe, modificamos el notebook
                notebook.setRam(newNotebook.getRam());
                notebook.setAlmacenamiento(newNotebook.getAlmacenamiento());
                found = true;
                System.out.println("Notebook de marca " + newNotebook.getMarca() + " y modelo " + newNotebook.getModelo() + " modificado.");
                break;
            }
        }

        // Si no encontramos el Notebook, lo agregamos
        if (!found) {
            notebooks.add(newNotebook);
            System.out.println("Nuevo Notebook de marca " + newNotebook.getMarca() + " y modelo " + newNotebook.getModelo() + " agregado.");
        }

        // Guardamos la lista actualizada de notebooks en el archivo
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(notebooks);
            objectOutputStream.close();
            System.out.println("Lista guardada correctamente en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mostramos la lista actualizada después de agregar o modificar el notebook
        System.out.println("\nLista actualizada:");
        notebooks.forEach(System.out::println);
    }
}


