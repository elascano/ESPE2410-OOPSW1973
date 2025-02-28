package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Donkey;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.FoodType;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;

import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        boolean isProducingMeat = true;
        int id = 1;
        float weight = 80.5F;
        String breed = "Pink";

        Date bornOnDate = new Date(2024, 10, 11);

        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes = new ArrayList<>();
        foodTypes.add(foodType);
        farmAnimal = new Pig(isProducingMeat, weight, id, breed, bornOnDate, foodTypes);
        System.out.println("farm Animal ---> " + farmAnimal);
        System.out.println("What is FarmAnimal now -->" + farmAnimal.getClass().getCanonicalName());
        
        
        weight = 200.0f;
        id = 2;
        breed = "Amiatina";

         weight = 200.0f;
         id= 2;
         breed = "Amiatina";
         bornOnDate = new Date(2020, 10, 11);
         foodTypes.add(foodType);
         foodTypes.clear();


        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        System.out.println("farmAnimal --> " + farmAnimal);
        
        Donkey donkey = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        donkey.load("ESPE", "Terracota");
        donkey.feed();
        donkey.getLoadWeight();
        donkey.produce();
        
    }
}
