package ec.edu.espe.samc.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import ec.edu.espe.samc.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class SAMCApp {
    private static final String ID_FILE = "generated_ids.json";
    private static final String CUSTOMER_FILE = "customers.json";
    private static ArrayList<Integer> generatedIds = new ArrayList<>();
    private static int lastId = 0;
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadGeneratedIds();
        loadCustomers();

        int option;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Leer clientes");
            System.out.println("3. Actualizar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createCustomer(scanner);
                    break;
                case 2:
                    readCustomers();
                    break;
                case 3:
                    updateCustomer(scanner);
                    break;
                case 4:
                    deleteCustomer(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (option != 5);

        saveGeneratedIds();
        saveCustomers();
        scanner.close();
    }

    private static void createCustomer(Scanner scanner) {
        lastId++;
        System.out.println("Ingrese el nombre del cliente:");
        String name = scanner.nextLine();
        int id = lastId;
        generatedIds.add(id);
        System.out.println("El ID del cliente generado es: " + id);

        System.out.println("Ingrese el correo electronico del cliente:");
        String email = scanner.nextLine();

        System.out.println("Ingrese la direccion del cliente:");
        String address = scanner.nextLine();

        System.out.println("Ingrese el numero de telefono del cliente:");
        String phoneNumber = scanner.nextLine();

        Customer customer = new Customer(name, id, email, address, phoneNumber);
        customers.add(customer);
        System.out.println("Cliente registrado exitosamente.");
    }

    private static void readCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes registrados:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    private static void updateCustomer(Scanner scanner) {
        System.out.println("Ingrese el ID del cliente a actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.println("Ingrese el nuevo nombre del cliente (dejar vacio para no cambiar):");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    customer.setName(name);
                }

                System.out.println("Ingrese el nuevo correo electrónico del cliente (dejar vacío para no cambiar):");
                String email = scanner.nextLine();
                if (!email.isEmpty()) {
                    customer.setEmail(email);
                }

                System.out.println("Ingrese la nueva dirección del cliente (dejar vacío para no cambiar):");
                String address = scanner.nextLine();
                if (!address.isEmpty()) {
                    customer.setAddress(address);
                }

                System.out.println("Ingrese el nuevo numero de telefono del cliente (dejar vacio para no cambiar):");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.isEmpty()) {
                    customer.setPhoneNumber(phoneNumber);
                }

                System.out.println("Cliente actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    private static void deleteCustomer(Scanner scanner) {
        System.out.println("Ingrese el ID del cliente a eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.remove(i);
                System.out.println("Cliente eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    private static void loadGeneratedIds() {
        File file = new File(ID_FILE);
        if (file.exists()) {
            try (Reader reader = new FileReader(file)) {
                Gson gson = new Gson();
                JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
                JsonArray jsonArray = jsonObject.getAsJsonArray("generatedIds");
                for (int i = 0; i < jsonArray.size(); i++) {
                    generatedIds.add(jsonArray.get(i).getAsInt());
                }
                lastId = jsonObject.get("lastId").getAsInt();
            } catch (IOException e) {
                System.out.println("Error al cargar los IDs generados: " + e.getMessage());
            }
        }
    }

    private static void saveGeneratedIds() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (Integer id : generatedIds) {
            jsonArray.add(id);
        }
        jsonObject.add("generatedIds", jsonArray);
        jsonObject.addProperty("lastId", lastId);

        try (Writer writer = new FileWriter(ID_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(jsonObject, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar los IDs generados: " + e.getMessage());
        }
    }

    private static void loadCustomers() {
        File file = new File(CUSTOMER_FILE);
        if (file.exists()) {
            try (Reader reader = new FileReader(file)) {
                Gson gson = new Gson();
                Customer[] customerArray = gson.fromJson(reader, Customer[].class);
                for (Customer customer : customerArray) {
                    customers.add(customer);
                }
            } catch (IOException e) {
                System.out.println("Error al cargar los clientes: " + e.getMessage());
            }
        }
    }

    private static void saveCustomers() {
        try (Writer writer = new FileWriter(CUSTOMER_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(customers.toArray(), writer);
        } catch (IOException e) {
            System.out.println("Error al guardar los clientes: " + e.getMessage());
        }
    }
}