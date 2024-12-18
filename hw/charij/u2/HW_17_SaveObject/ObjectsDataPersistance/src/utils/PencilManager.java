package utils;

import ec.edu.espe.pencil.model.CharijPencil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PencilManager {
    private static final String dataFile = "charijPencilData.ser";
    private List<CharijPencil> charijPencils;

    public PencilManager() {
        this.charijPencils = loadData();
    }

    public List<CharijPencil> getAllCharijPencils() {
        return charijPencils;
    }

    public void addCharijPencil(CharijPencil charijPencil) throws Exception {
        if (findCharijPencilById(charijPencil.getId()) != null) {
            throw new Exception("A  Pencil with this ID already exists.");
        }
        charijPencils.add(charijPencil);
        saveData();
        System.out.println(" Pencil added successfully.");
    }

    public void updateCharijPencil(int id, String newBrand, String newColor, double newPrice) throws Exception {
        CharijPencil charijPencil = findCharijPencilById(id);
        if (charijPencil == null) {
            throw new Exception("Charij Pencil with ID " + id + " not found.");
        }
        charijPencil.setBrand(newBrand);
        charijPencil.setColor(newColor);
        charijPencil.setPrice(newPrice);
        saveData();
        System.out.println("Pencil updated successfully.");
    }

    public void deleteCharijPencil(int id) throws Exception {
        CharijPencil charijPencil = findCharijPencilById(id);
        if (charijPencil == null) {
            throw new Exception(" Pencil with ID " + id + " not found.");
        }
        charijPencils.remove(charijPencil);
        saveData();
        System.out.println(" Pencil deleted successfully.");
    }

    private CharijPencil findCharijPencilById(int id) {
        for (CharijPencil charijPencil : charijPencils) {
            if (charijPencil.getId() == id) {
                return charijPencil;
            }
        }
        return null;
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            oos.writeObject(charijPencils);
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private List<CharijPencil> loadData() {
        File file = new File(dataFile);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<CharijPencil>) ois.readObject();
        } catch (IOException e) {
            System.err.println("Error loading data: " + e.getMessage());
            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found. " + e.getMessage());
            return new ArrayList<>();
        }
    }
}