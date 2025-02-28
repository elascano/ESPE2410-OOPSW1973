

package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Donkey;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.FoodType;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mateo Topon
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        boolean isProducingMeat = true;
        int id = 1;
        float weight=80.5F;
        String breed = "Pink";
        Date bornOnDate = new Date(2024, 12, 11);
        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList<>();
        foodTypes.add(foodType);
        
        
        farmAnimal = new Pig(true, 0, 0, breed, bornOnDate, foodTypes);
        System.out.println("What is a farmAnimal now --->" + farmAnimal.getClass().getSimpleName());
        System.out.println("farm Animal" + farmAnimal);
        
        
        weight = 200.0F;
        id = 2;
        breed = "Amiantina";
        bornOnDate = new Date(2021, 12, 01);
        foodTypes.add(foodType);
        
        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
          System.out.println("What is farmAnimal a now --->" + farmAnimal.getClass().getCanonicalName());
        System.out.println("farmAnimal -->" + farmAnimal);
        
        Donkey donkey = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        donkey.load("ESPE", "Terracota");
        donkey.feed();
        donkey.produce();
        donkey.getLoadWeight();
        donkey.setLoadWeight(500);
           
    }
}
