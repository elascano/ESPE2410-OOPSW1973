/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositePattern.model;

/**
 *
 * @author Lisbeth Tipan
 */
public class President extends Supervisor {
private static President instance;

    private President(String name) {
        super(name, "President");
    }

    public static President getInstance(String name) {
        if (instance == null) {
            instance = new President(name);
        } else {
            instance.name = name;
        }
        return instance;
    }
}