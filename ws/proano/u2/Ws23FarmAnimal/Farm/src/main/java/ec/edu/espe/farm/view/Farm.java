

package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Donkey;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.FoodType;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MarlonPasquel
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        boolean isProducingMeat = true;
        int id = 1;
        float weight =80.5F;
        String breed = "Pink";
        Date bornOnDate = new Date(2024, 10, 11); 
        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList<>();
        foodTypes.add(foodType);
        farmAnimal = new Pig(true, 0, 0, breed, bornOnDate, foodTypes);
        System.out.println("what is farm Animal now ---> " + farmAnimal.getClass().getCanonicalName());
        
        weight = 200.0F;
        id = 2;
        breed = "Amiatina";
        bornOnDate = new Date(2020, 10, 11);
        foodTypes.add(foodType);
        
        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        System.out.println("farmAnimal is A --> " + farmAnimal.getClass().getCanonicalName());
        
        Donkey donkey = new Donkey (weight, id, breed, bornOnDate, foodTypes);
        donkey.load("ESPE", "Terracota");
        donkey.feed();
        donkey.getLoadWeight();
        donkey.produce();
        donkey.setLoadWeight(500);
        System.out.println("donkey --> " +donkey);
        
        
        
    }
}
