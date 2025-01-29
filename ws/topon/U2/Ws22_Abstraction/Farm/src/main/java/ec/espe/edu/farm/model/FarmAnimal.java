/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mateo Topon
 */
public abstract class FarmAnimal {
    int id;
    String breed;
    Date bornOnDate;
    ArrayList<FoodType> foodTypes;
    
    
    public int getAgeInMonths(){
        //compute age based on current date and born on date
        return 0;
    }
    public abstract FoodType feed();
    public abstract Product produce();
    public abstract float computeCostOfFood();
}
