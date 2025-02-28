package ec.edu.espe.zooapp.controller;

import ec.edu.espe.zooapp.model.Animal;
import ec.edu.espe.zooapp.model.Dog;
import ec.edu.espe.zooapp.model.Cat;
import ec.edu.espe.zooapp.utils.ManageFileMongoDB;
import javax.swing.JOptionPane;

public class AnimalController {
    private final ManageFileMongoDB databaseManager;

    public AnimalController() {
        this.databaseManager = new ManageFileMongoDB();
    }

    public void registerDog(String name, int age, String breed, boolean isTrained) {
        Dog dog = new Dog(name, age, "Dog", breed, isTrained);
        databaseManager.saveAnimal(dog);
    }

    public void registerCat(String name, int age, String furColor, boolean isIndoor) {
        Cat cat = new Cat(name, age, "Cat", furColor, isIndoor);
        databaseManager.saveAnimal(cat);
    }

    public void handleSaveButton(String name, String ageRange, String species) {
        int age = parseAge(ageRange);

        if (species.equals("Dog")) {
            String breed = JOptionPane.showInputDialog("Enter the breed of the dog:");
            boolean isTrained = JOptionPane.showConfirmDialog(null, "Is the dog trained?", "Trained", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            registerDog(name, age, breed, isTrained);
        } else if (species.equals("Cat")) {
            String furColor = JOptionPane.showInputDialog("Enter the fur color of the cat:");
            boolean isIndoor = JOptionPane.showConfirmDialog(null, "Is the cat an indoor cat?", "Indoor", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            registerCat(name, age, furColor, isIndoor);
        }

        JOptionPane.showMessageDialog(null, "Animal registered successfully!");
    }

    public void handleReadListButton() {
        // Aquí puedes implementar la lógica para leer la lista de animales desde la base de datos
        // y devolverla para mostrarla en la interfaz.
        JOptionPane.showMessageDialog(null, "Read List functionality not implemented yet.");
    }

    private int parseAge(String ageRange) {
        switch (ageRange) {
            case "0-2 years":
                return 1;
            case "3-5 years":
                return 4;
            case "6-9 years":
                return 7;
            case "10-13 years":
                return 11;
            case "14-17 years":
                return 15;
            default:
                return 0;
        }
    }
}
