/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.scissorsObject.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author Lisbeth Tipan
 */
public class ReadFromFile {
    @SuppressWarnings("unchecked")
    public static <T> List<T> read(String fileName) {
        List<T> list = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (List<T>) ois.readObject();
            System.out.println("File read successfully: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return list;
    }
}
