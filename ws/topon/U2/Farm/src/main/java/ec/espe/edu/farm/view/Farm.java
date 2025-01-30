/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Donkey;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.FoodType;
import ec.espe.edu.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lisbeth Tipan
 */
public class Farm {
    public static void main(String[] args){
        FarmAnimal farmAnimal;
        boolean isProducingMeat =true;
        int id=1;
        float weight=80.5F;
        String breed="Pink";
        Date bornOnDate= new Date(2024, 10,11);
        FoodType foodType= new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList <>();
        farmAnimal = new Pig(true,0,0,breed,bornOnDate,foodTypes);
        System.out.println("What is FarmAnimal now -->" + farmAnimal.getClass().getCanonicalName());
        System.out.println("farm Animal is a -->" + farmAnimal.getClass().getCanonicalName());
        farmAnimal.getAgeInMonths();
        
        weight=200.0F;
        id=2;
        breed="Amiatina";
        bornOnDate= new Date(2020,10,11);
        foodTypes.add(foodType);
        
        
        farmAnimal = new Donkey(weight ,id,breed,bornOnDate,foodTypes);
        System.out.println("farmAnimal -->"+ farmAnimal);
        
        Donkey donkey = new Donkey(weight ,id,breed,bornOnDate,foodTypes);
        donkey.load("Espe","Terracota");
        donkey.feed();
        donkey.getLoadWeight();
        donkey.produce();
        donkey.setLoadWeight(500);
        System.out.println("donkey -->"+ donkey);
        
               
    }
}
