
package ec.edu.espe.farmsimulator.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Robinson Bonilla
 */
public class Chicken {
    //Atributos
    int id;
    String name ;
    String  color;
    int age;
    //Date bornOnDate;
    boolean notMolting;
    
    //Metodos

  

//Pedir al usuario que llene los datos 

    public Chicken(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    
    
    
    
    
    //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    public int getId() {
        
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public boolean isNotMolting() {
        return notMolting;
    }

    public void setNotMolting(boolean notMolting) {
        this.notMolting = notMolting;
    }
    
    
    
}
