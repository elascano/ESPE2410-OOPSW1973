/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.scissorsObject.model;

import java.io.Serializable;

/**
 *
 * @author Lisbeth Tipan
 */
public class Scissors implements Serializable {
    private String type;
    private String material;
    private double size;

  
    public Scissors(String type, String material, double size) {
        this.type = type;
        this.material = material;
        this.size = size;
    }

   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Scissors{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                '}';
    }
}

