package ec.edu.espe.model;

public class CellPhoneModel {
    
    private int id;
    private String brand;
    private String color; // Agregar el campo 'color'
    private int storage;

    public CellPhoneModel(int id, String brand, String color, int storage) {
        this.id = id;
        this.brand = brand;
        this.color = color; // Inicializar el campo 'color'
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "CellPhoneModel{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", storage=" + storage + '}'; // Incluir el campo 'color'
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
