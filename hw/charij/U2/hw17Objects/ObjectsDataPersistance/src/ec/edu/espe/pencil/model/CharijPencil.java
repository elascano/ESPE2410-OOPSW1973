package ec.edu.espe.pencil.model;

import java.io.Serializable;

public class CharijPencil implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String brand;
    private String color;
    private double price;

    public CharijPencil(int id, String brand, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Brand: %s | Color: %s | Price: $%.2f",
            id, brand, color, price
        );
    }
}